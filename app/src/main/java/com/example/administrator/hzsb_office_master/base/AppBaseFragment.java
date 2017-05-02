package com.example.administrator.hzsb_office_master.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hzsb_office_interface.BaseFragment;
import com.yolanda.nohttp.NoHttp;
import com.yolanda.nohttp.rest.OnResponseListener;
import com.yolanda.nohttp.rest.Request;
import com.yolanda.nohttp.rest.RequestQueue;

import java.util.List;

import butterknife.ButterKnife;

/**
 *
 * 文件描述：标准Fragment基类
 * Created by liujiancheng  on 2017/4/1.
 */

public abstract class AppBaseFragment extends BaseFragment{
    protected Context mAppContext;
    protected RequestQueue requestQueue;
    @Override
    public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);
        ButterKnife.bind(this,parentView);
        mAppContext = mActivity.getApplicationContext();
        requestQueue = NoHttp.newRequestQueue();
    }
    /**
     * 文件描述   :   NoHttpRequest请求
     * @param what     what
     * @param request  请求对象
     * @param listener 结果监听
     * @param <T>      请求的数据类型
     */
    public <T> void NoHttpRequest(int what, Request<T> request, OnResponseListener<T> listener){
        requestQueue.add(what,request,listener);
    }
    /**
     * 文件描述：封装Intent跳转Activity不带参
     * @param context
     * @param class1
     */
    public void startIntent(Context context,Class class1){
        Intent intent = new Intent(context,class1);
        context.startActivity(intent);
    }
    /**
     * 文件描述：封装Intent跳转Activity带参
     * @param context
     * @param class1
     * @param type
     */
    public void startIntents(Context context,Class class1,String type){
        Intent intent = new Intent(context,class1);
        intent.putExtra("type",type);
        context.startActivity(intent);
    }
    /**
     * 文件描述：封装Intent跳转Activity带多个参数集合
     * @param context
     * @param class1
     * @param type
     */
    public void startIntentByList(Context context,Class class1,List<String> type){

    }



}
