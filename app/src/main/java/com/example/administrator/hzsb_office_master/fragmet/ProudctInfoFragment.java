package com.example.administrator.hzsb_office_master.fragmet;

import android.os.Bundle;
import android.view.View;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;

/**
 * Created by liujiancheng  on 2017/4/18.
 * 产品信息fragment
 */

public class ProudctInfoFragment extends AppBaseFragment{

    public static ProudctInfoFragment mProudctInfoFragment;

    public static ProudctInfoFragment getInstance(){
        if(mProudctInfoFragment == null){
            return new ProudctInfoFragment();
        }
        return mProudctInfoFragment;
    }


    @Override
    public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);

    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_productinfo;
    }
}
