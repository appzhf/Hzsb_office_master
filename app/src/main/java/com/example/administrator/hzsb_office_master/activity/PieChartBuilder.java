package com.example.administrator.hzsb_office_master.activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseActivity;

import butterknife.BindView;

/**
 * 文件描述：图形统计，柱形图，饼状图，折线图
 * @author liujiancheng
 * @date 2017/4/23
 */
public class PieChartBuilder extends AppBaseActivity {

    @BindView(R.id.chartLinear) LinearLayout mLinearLayout;
    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        mLinearLayout.setBackgroundColor(R.color.color_littleBlack);

    }
    @Override
    public int getLayoutResId() {
        return R.layout.activity_pie_chart_builder;
    }
}
