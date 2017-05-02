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
 * �ļ���������san�����棬����Ȩ����ʾ����
 * @author liujiancheng
 * @data 2017/4/13
 * "�µ�","���","�ɹ�","����","�ʼ�","���","����","ȫ��"ͼ�ι���
 */
public class ChartFragment extends AppBaseFragment {

    @BindView(R.id.chartLinear) LinearLayout chartLayout;
    @BindView(R.id.percentageLinear) LinearLayout percentageLauout;
    private static int[] COLORS = new int[] { Color.RED, Color.GREEN,
            Color.BLUE, Color.MAGENTA, Color.CYAN, Color.YELLOW, Color.DKGRAY };
    double data[] = new double[] { 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    private DefaultRenderer mRenderer = new DefaultRenderer();
    private static double VALUE = 0;
    private CategorySeries mSeries = new CategorySeries("");//PieChart��DataSet��ʵ����һЩ��ֵ�ԣ���Mapʹ�÷������
    private GraphicalView mChartView;// ������ʾPieChart ��Ҫ�������ļ�Manifest�����GraphicalActivity
    public static ChartFragment getInstance(){
        return new ChartFragment();
    }
    @Override
    public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);
        //��״ͼ���죬�������Է�װ����дdemo
        mRenderer.setStartAngle(180);//����Ϊˮƽ����
        mRenderer.setDisplayValues(true);//�Ƿ���ʾ����
        mRenderer.setFitLegend(true);//�����Ƿ���ʾͼ��
        mRenderer.setLegendTextSize(10);//����ͼ��������ʾ��С
        mRenderer.setLegendHeight(10);//����ͼ���߶�
        for (int i = 0; i <data.length ; i++)
            VALUE += data[i];
        for (int i = 0; i < data.length; i++) {
            mSeries.add("����"+(i+1),data[i]/VALUE);// �����������ƺͶ�Ӧ����ֵ,�൱���ֵ��
            SimpleSeriesRenderer renderer =  new SimpleSeriesRenderer();
            if(i < COLORS.length){
                renderer.setColor(COLORS[i]);//�����������ɫ
            }else {
                renderer.setColor(getRandomColor());
            }
            renderer.setChartValuesFormat(NumberFormat.getPercentInstance());
            mRenderer.addSeriesRenderer(renderer);
        }
        // Ϊ����Ҫ��ChartFactory��ȡPieChartView
        if(mChartView == null){
            mChartView = ChartFactory.getPieChartView(mAppContext,mSeries,mRenderer);// ����mChartView
            mRenderer.setClickEnabled(true);
            mChartView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SeriesSelection seriesSelection = mChartView.getCurrentSeriesAndPoint();//��ȡ��ǰ����ָ��
                    if(seriesSelection == null){
                        Utils.showToast(mAppContext,"δѡ������");
                    }else{
                        for (int i = 0; i < mSeries.getItemCount() ; i++) {
                            mRenderer.getSeriesRendererAt(i).setHighlighted(i == seriesSelection.getPointIndex());
                        }
                        mChartView.repaint();
                        Utils.showToast(mAppContext, "ѡ����ǵ�"
                                + (seriesSelection
                                .getPointIndex() + 1)
                                + " �� "
                                + " �ٷֱ�Ϊ  "
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
        //��������ͼ���������Է�װ����дdemo
        String[] titles = new String[] { "��������", "�������" };//��״ͼ���������е�����
        //�����״ͼ�������е�ֵ
        ArrayList<double[]> value = new ArrayList<>();
        double[] d1 = new double[] { 0.1, 0.3, 0.7, 0.8, 0.5 };
        double[] d2 = new double[] { 0.2, 0.3, 0.4, 0.8, 0.6 };
        value.add(d1);
        value.add(d2);
        int[] colors = { Color.BLUE, Color.RED};
        //Ϊ���������״ͼ
        percentageLauout.addView(
                xychar(titles, value, colors, 6, 1, new double[] { 2012,
                        2017.5, 0, 1 }, new int[] { 2013, 2014, 2015, 2016,
                        2017 },"", true),
                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));

    }

    public GraphicalView xychar(String[] titles, ArrayList<double[]> value,
                                int[] colors, int x, int y,double[] range, int []xLable ,String xtitle, boolean f) {
        //�����Ⱦ
        XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();
        //������е����ݼ�
        XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
        //�������ݼ��Լ���Ⱦ
        for (int i = 0; i < titles.length; i++) {

            XYSeries series = new XYSeries(titles[i]);
            double [] yLable= value.get(i);
            for (int j=0;j<yLable.length;j++) {
                series.add(xLable[j],yLable[j]);
            }
            dataset.addSeries(series);
            XYSeriesRenderer xyRenderer = new XYSeriesRenderer();
            // ������ɫ
            xyRenderer.setColor(colors[i]);
            // ���õ����ʽ //
            xyRenderer.setPointStyle(PointStyle.SQUARE);
            // ��Ҫ���Ƶĵ���ӵ����������
            renderer.addSeriesRenderer(xyRenderer);
        }
        //����x���ǩ��
        renderer.setXLabels(x);
        //����Y���ǩ��
        renderer.setYLabels(y);
        //����x������ֵ
        renderer.setXAxisMax(x - 0.5);
        //���������ɫ
        renderer.setAxesColor(Color.BLACK);
        //����x���y��ı�ǩ���뷽ʽ
        renderer.setXLabelsAlign(Paint.Align.CENTER);
        renderer.setYLabelsAlign(Paint.Align.RIGHT);
        // ������ʵ����
        renderer.setShowGrid(true);

        renderer.setShowAxes(true);
        // ��������ͼ֮��ľ���
        renderer.setBarSpacing(0.2);
        renderer.setInScroll(false);
        renderer.setPanEnabled(false, false);
        renderer.setClickEnabled(false);
        //����x���y���ǩ����ɫ
        renderer.setXLabelsColor(Color.RED);
        renderer.setYLabelsColor(0,Color.RED);

        int length = renderer.getSeriesRendererCount();
        //����ͼ��ı���
        renderer.setChartTitle(xtitle);
        renderer.setLabelsColor(Color.RED);

        //����ͼ���������С
        renderer.setLegendTextSize(18);
        //����x���y��������Сֵ
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
