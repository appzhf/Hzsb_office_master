package com.example.administrator.hzsb_office_master.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telecom.Call;

import com.example.administrator.hzsb_office_master.entity.Get;
import com.example.hzsb_office_interface.BaseActivity;
import com.yolanda.nohttp.NoHttp;
import com.yolanda.nohttp.rest.OnResponseListener;
import com.yolanda.nohttp.rest.Request;
import com.yolanda.nohttp.rest.RequestQueue;

import butterknife.ButterKnife;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit.http.POST;

/**
 * 文件描述：标准Activity基类
 * Created by liujiancheng  on 2017/4/1.
 *
 */

public abstract class AppBaseActivity extends BaseActivity{

    protected Context mAppContext;
    protected Activity activity;
    protected RequestQueue mRequestQueue;
    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        activity = this;
        ButterKnife.bind(this);
        mAppContext = getApplicationContext();
        mRequestQueue = NoHttp.newRequestQueue();

    }
    /**
     * 文件描述   :    NoHttpRequest请求
     * @param <T>      请求的数据类型
     * @param what     what
     * @param request  请求对象
     * @param listener 结果监听
     */
    public <T> void NoHttpRequest(int what, Request<String> request, OnResponseListener<String> listener){
        mRequestQueue.add(what,request,listener);
    }


    /**
     * 文件描述：Rxjava和Retrofit相结合的网络请求
     * @param url
     */
    public void sendRequest(String url){
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(url)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
