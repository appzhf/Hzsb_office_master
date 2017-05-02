package com.example.administrator.hzsb_office_master.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

import java.util.ArrayList;

/**
 * Created by liujiancheng  on 2017/4/20.
 * 文件描述：fragmentPageAdapter的刷新问题
 */

public class FragmentVPAdapter extends FragmentPagerAdapter{

    ArrayList<Fragment> mFragments;
    FragmentManager fm;

    public FragmentVPAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fm = fm;
        this.mFragments = fragments;
    }

    public void setFragments(ArrayList<Fragment> fragments){
        if(this.mFragments != null){
            FragmentTransaction ft = fm.beginTransaction();
            for (Fragment f:this.mFragments) {
                ft.remove(f);
            }
            ft.commit();
            ft = null;
            fm.executePendingTransactions();
        }
        this.mFragments = fragments;
        notifyDataSetChanged();

    }


    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
