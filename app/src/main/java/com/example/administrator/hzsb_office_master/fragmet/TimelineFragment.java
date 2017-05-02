package com.example.administrator.hzsb_office_master.fragmet;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;
import com.example.administrator.hzsb_office_master.pulldownview.PullToZoomScrollViewEx;

import butterknife.BindView;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class TimelineFragment extends AppBaseFragment implements View.OnClickListener {



    @BindView(R.id.pull_scroll) PullToZoomScrollViewEx mPullToZoomScrollViewEx;
    private TextView mineFunAllOrder;
    private TextView mineFunWaitPay;
    private TextView mineFunWaitReceive;
    private TextView mineFunPayback;
    private TextView mineFunEvaluate;
    private TextView mTxtUserName;
    private TextView attenCountTv;
    private TextView fansTv;
    private TextView salecardTv;
    private TextView bankNoTv;
    private TextView frozenMoneyTv;
    private TextView availableMoneyTv;
    private CircleImageView imgHead;
    private LinearLayout mTBoardBottom;
    private LinearLayout contentContainer;




    public static TimelineFragment getInstance(){
        return new TimelineFragment();
    }


    @Override
    public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, (int) (9.0F * (width / 14.0F)));
        mPullToZoomScrollViewEx.setHeaderLayoutParams(layoutParams);
        View headView = LayoutInflater.from(mActivity).inflate(R.layout.mine_tt,null,false);
        View zoomView = LayoutInflater.from(mActivity).inflate(R.layout.profile_zoom_view,null,false);
        View contentView = LayoutInflater.from(mActivity).inflate(R.layout.profile_content_view,null,false);
        mPullToZoomScrollViewEx.setHeaderView(headView);
        mPullToZoomScrollViewEx.setZoomView(zoomView);
        mPullToZoomScrollViewEx.setScrollContentView(contentView);
        mPullToZoomScrollViewEx.setParallax(true);
        init();

    }

    private void init() {
        mineFunAllOrder = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_fun_all_order);
        mineFunWaitPay = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_fun_wait_pay);
        mineFunWaitReceive = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_fun_wait_receive);
        mineFunPayback = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_fun_payback);
        mineFunEvaluate = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_fun_evaluate);
        mTBoardBottom = (LinearLayout) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.m_t_board_bottom);
        contentContainer = (LinearLayout) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.content_container);
        mTxtUserName = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.txt_username);

        attenCountTv = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_atten_shop_tv);
        fansTv = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_fansno_tv);
        salecardTv = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_quan_tv);
        bankNoTv = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_hb_bankno_tv);
        availableMoneyTv = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_hb_availablemoney_tv);
        frozenMoneyTv = (TextView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_hb_frozenmoney_tv);
        imgHead = (CircleImageView) mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.img_head);

        mPullToZoomScrollViewEx.getPullRootView().findViewById(R.id.mine_tt_settings_iv).setOnClickListener(this);
    }




    @Override
    public int getLayoutResId() {
        return R.layout.activity_timeline_fragment;
    }
}
