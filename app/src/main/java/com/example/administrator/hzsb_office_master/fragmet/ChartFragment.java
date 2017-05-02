package com.example.administrator.hzsb_office_master.fragmet;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;
import com.example.administrator.hzsb_office_master.utils.Utils;
import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.BarChart;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.CategorySeries;
import org.achartengine.model.SeriesSelection;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;
import butterknife.BindView;

/**
 * 文件描述：第san个界面，根据权限显示内容
 * @author liujiancheng
 * @data 2017/4/13
 * "下单","审核","采购","生产","质检","入库","发货","全部"图形构造
 */
public class ChartFragment extends AppBaseFragment {

    @BindView(R.id.chartLinear) LinearLayout chartLayout;
    @BindView(R.id.percentageLinear) LinearLayout percentageLauout;
    private static int[] COLORS = new int[] { Color.RED, Color.GREEN,
            Color.BLUE, Color.MAGENTA, Color.CYAN, Color.YELLOW, Color.DKGRAY };
    double data[] = new double[] { 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    private DefaultRenderer mRenderer = new DefaultRenderer();
    private static double VALUE = 0;
    private CategorySeries mSeries = new CategorySeries("");//PieChart的DataSet其实就是一些键值对，跟Map使用方法差不多
    private GraphicalView mChartView;// 用来显示PieChart 需要在配置文件Manifest中添加GraphicalActivity
    public static ChartFragment getInstance(){
        return new ChartFragment();
    }
    @Override
    public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);
        //饼状图构造，方法可以封装，先写demo
        mRenderer.setStartAngle(180);//设置为水平开发
        mRenderer.setDisplayValues(true);//是否显示数据
        mRenderer.setFitLegend(true);//设置是否显示图例
        mRenderer.setLegendTextSize(10);//设置图例字体显示大小
        mRenderer.setLegendHeight(10);//设置图例高度
        for (int i = 0; i <data.length ; i++)
            VALUE += data[i];
        for (int i = 0; i < data.length; i++) {
            mSeries.add("数据"+(i+1),data[i]/VALUE);// 设置种类名称和对应的数值,相当与键值对
            SimpleSeriesRenderer renderer =  new SimpleSeriesRenderer();
            if(i < COLORS.length){
                renderer.setColor(COLORS[i]);//设置描绘器颜色
            }else {
                renderer.setColor(getRandomColor());
            }
            renderer.setChartValuesFormat(NumberFormat.getPercentInstance());
            mRenderer.addSeriesRenderer(renderer);
        }
        // 为空需要从ChartFactory获取PieChartView
        if(mChartView == null){
            mChartView = ChartFactory.getPieChartView(mAppContext,mSeries,mRenderer);// 构建mChartView
            mRenderer.setClickEnabled(true);
            mChartView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SeriesSelection seriesSelection = mChartView.getCurrentSeriesAndPoint();//获取当前类别和指针
                    if(seriesSelection == null){
                        Utils.showToast(mAppContext,"未选择数据");
                    }else{
                        for (int i = 0; i < mSeries.getItemCount() ; i++) {
                            mRenderer.getSeriesRendererAt(i).setHighlighted(i == seriesSelection.getPointIndex());
                        }
                        mChartView.repaint();
                        Utils.showToast(mAppContext, "选择的是第"
                                + (seriesSelection
                                .getPointIndex() + 1)
                                + " 项 "
                                + " 百分比为  "
                                + NumberFormat
                                .getPercentInstance()
                                .format(seriesSelection
                                        .getValue()));
                    }
                }
            });
            chartLayout.addView(mChartView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        }else{
            mChartView.repaint();
        }
        //绘制柱形图，方法可以封装，先写demo
        String[] titles = new String[] { "出库数量", "入库数量" };//柱状图的两个序列的名字
        //存放柱状图两个序列的值
        ArrayList<double[]> value = new ArrayList<>();
        double[] d1 = new double[] { 0.1, 0.3, 0.7, 0.8, 0.5 };
        double[] d2 = new double[] { 0.2, 0.3, 0.4, 0.8, 0.6 };
        value.add(d1);
        value.add(d2);
        int[] colors = { Color.BLUE, Color.RED};
        //为布局添加柱状图
        percentageLauout.addView(
                xychar(titles, value, colors, 6, 1, new double[] { 2012,
                        2017.5, 0, 1 }, new int[] { 2013, 2014, 2015, 2016,
                        2017 },"", true),
                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));

    }

    public GraphicalView xychar(String[] titles, ArrayList<double[]> value,
                                int[] colors, int x, int y,double[] range, int []xLable ,String xtitle, boolean f) {
        //多个渲染
        XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();
        //多个序列的数据集
        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
        //构建数据集以及渲染
        for (int i = 0; i < titles.length; i++) {

            XYSeries series = new XYSeries(titles[i]);
            double [] yLable= value.get(i);
            for (int j=0;j<yLable.length;j++) {
                series.add(xLable[j],yLable[j]);
            }
            dataset.addSeries(series);
            XYSeriesRenderer xyRenderer = new XYSeriesRenderer();
            // 设置颜色
            xyRenderer.setColor(colors[i]);
            // 设置点的样式 //
            xyRenderer.setPointStyle(PointStyle.SQUARE);
            // 将要绘制的点添加到坐标绘制中
            renderer.addSeriesRenderer(xyRenderer);
        }
        //设置x轴标签数
        renderer.setXLabels(x);
        //设置Y轴标签数
        renderer.setYLabels(y);
        //设置x轴的最大值
        renderer.setXAxisMax(x - 0.5);
        //设置轴的颜色
        renderer.setAxesColor(Color.BLACK);
        //设置x轴和y轴的标签对齐方式
        renderer.setXLabelsAlign(Paint.Align.CENTER);
        renderer.setYLabelsAlign(Paint.Align.RIGHT);
        // 设置现实网格
        renderer.setShowGrid(true);

        renderer.setShowAxes(true);
        // 设置条形图之间的距离
        renderer.setBarSpacing(0.2);
        renderer.setInScroll(false);
        renderer.setPanEnabled(false, false);
        renderer.setClickEnabled(false);
        //设置x轴和y轴标签的颜色
        renderer.setXLabelsColor(Color.RED);
        renderer.setYLabelsColor(0,Color.RED);

        int length = renderer.getSeriesRendererCount();
        //设置图标的标题
        renderer.setChartTitle(xtitle);
        renderer.setLabelsColor(Color.RED);

        //设置图例的字体大小
        renderer.setLegendTextSize(18);
        //设置x轴和y轴的最大最小值
        renderer.setRange(range);
        renderer.setMarginsColor(0x00888888);
        for (int i = 0; i < length; i++) {
            SimpleSeriesRenderer ssr = renderer.getSeriesRendererAt(i);
            ssr.setChartValuesTextAlign(Paint.Align.RIGHT);
            ssr.setChartValuesTextSize(12);
            ssr.setDisplayChartValues(f);
        }
        GraphicalView mChartView = ChartFactory.getBarChartView(mAppContext.getApplicationContext(),
                dataset, renderer, BarChart.Type.DEFAULT);
        return mChartView;
    }

    private int getRandomColor() {
        Random random = new Random();
        int R = random.nextInt(255);
        int G = random.nextInt(255);
        int B = random.nextInt(255);
        return Color.rgb(R, G, B);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_chart_fragment;
    }
}
