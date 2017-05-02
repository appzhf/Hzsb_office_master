package com.example.administrator.hzsb_office_master.adapter;

import android.sax.RootElement;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.administrator.hzsb_office_master.fragmet.DemoFragment;

/**
 * Created by liujiancheng  on 2017/4/6.
 */

public class ViewPagerAdapter  extends FragmentPagerAdapter{

    String type;

    public ViewPagerAdapter(FragmentManager fm,String type) {
        super(fm);
        this.type = type;
        System.out.println("123"+type);

    }

    @Override
    public Fragment getItem(int position) {
        return new DemoFragment();
    }

    @Override
    public int getCount() {
            return 4;


    }

    String title[] = {"权限操作","two","three","four"};

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
