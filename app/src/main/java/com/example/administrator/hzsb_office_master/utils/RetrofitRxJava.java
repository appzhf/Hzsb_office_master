package com.example.administrator.hzsb_office_master.utils;

/**
 *
 * 文件描述：retrofit的请求管理类,单例模式Moudle
 * Created by liujiancheng  on 2017/4/24.
 */

public class RetrofitRxJava {

    private RetrofitRxJava(){}

    public static RetrofitManage getInstance(){
        return RetrofitManage.retrofitManage;
    }

    private static class RetrofitManage{
        private static final RetrofitManage retrofitManage = new RetrofitManage();
    }
}
