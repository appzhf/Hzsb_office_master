package com.example.administrator.hzsb_office_master.fragmet;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;
import com.example.hzsb_office_interface.BaseFragment;


import butterknife.BindView;

/**
 * @author liujiancheng
 *  AboutFragment
 *
 */
public class AboutFragment extends AppBaseFragment {

    @BindView(R.id.mTabLayout)      TabLayout mTabLayout;
    @BindView(R.id.mView_pager)     ViewPager mViewPager ;

    //private ViewPagerAdapter mAdpater;
    private SimpleAdapter mAdapter;
    private static AboutFragment aboutFragment;
    public static BaseFragment getInstance(){
        if(aboutFragment == null){
            return aboutFragment =  new AboutFragment();
        }
        return aboutFragment;
    }


    @Override public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);
        mViewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position){
                    case 0:
                        return MenuFragment.getInstance();
                    case 1:
                        return Inventoryfragment.getInstance();
                    case 2:
                        return ProudctInfoFragment.getInstance();
                    case 3:
                        return JobLogFragment.getInstance();
                }
                return new Fragment();
            }

            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position){
                    case 0:
                        return "全部";
                    case 1:
                        return "库存查询";
                    case 2:
                        return "产品信息";
                    case 3:
                        return "任务日志";
                }
                return "";
            }
            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                return new FragmentUtils().instantiateItem(getFragmentManager(),
                        container, getItem(position), getPageTitle(position).toString());
            }
            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                new FragmentUtils().destroyItem(getFragmentManager(), object);
            }
        });
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabTextColors(R.color.white,R.color.cpb_blue);
    }


    private String GetReturn(String type) {
       String permission = null;
        if(type.equals("高级管理员")||type.equals("中级管理员")||type.equals("初级管理员")){
            permission = "管理";
        }else if(type.equals("下单权限")){
            permission = "下单";
        }else if(type.equals("质检权限")){
            permission = "质检";
        }else if(type.equals("入库权限")){
            permission = "入库";
        }else if(type.equals("采购权限")){
            permission = "采购";
        }
        return permission;
    }





    @Override
    public int getLayoutResId() {
        return R.layout.activity_about_fragment;
    }
}

