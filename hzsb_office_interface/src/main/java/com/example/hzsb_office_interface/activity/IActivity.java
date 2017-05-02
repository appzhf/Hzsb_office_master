package com.example.hzsb_office_interface.activity;

import android.os.Bundle;

/**
 * Created by liujiancheng  on 2017/3/29.
 * 标准Activity接口
 */

public interface IActivity {


    /**
     * 利用getLayoutResId()加载布局
     */
    int getLayoutResId();
    /**
     * 第一次加载initFirst()方法
     */
    void initFirst();
    /**
     * 在加载布局之前操作initPre()
     */
    void initPre();
    /**
     * 初始化View
     */
    void initView(Bundle savedInstanceState);
    /**
     * 初始化date
     */
    void initdata();
    /**
     * 点击事件
     */
    void viewClick();


}
