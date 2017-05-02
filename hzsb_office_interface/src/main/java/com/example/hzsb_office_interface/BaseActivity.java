package com.example.hzsb_office_interface;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.example.hzsb_office_interface.activity.IActivity;
import com.example.hzsb_office_interface.server.IServer;

import butterknife.ButterKnife;


/**
 * Created by liujiancheng  on 2017/3/29.
 */

public abstract class BaseActivity extends AppCompatActivity implements IActivity, View.OnClickListener,IServer{

    private static final String TAG = BaseActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFirst();
        initPre();
        setContentView(getLayoutResId());
        initView(savedInstanceState);
    }


    @Override public void initFirst() {}
    @Override public void initPre() {}
    @Override public void initView(Bundle savedInstanceState) {}
    @Override public void initdata() {}
    @Override public void viewClick() {}
    @Override public void Regist() {}
    @Override public void unRegister() {}





    /**
     * 点击事件的调用
     *
     * @param v
     */
    @Override public void onClick(View v) {
        viewClick();
    }

    /**
     * activity的生命周期
     */
    @Override protected void onStart() {
        super.onStart();
    }
    @Override protected void onResume() {
        super.onResume();
    }
    @Override protected void onPause() {
        super.onPause();
    }
    @Override protected void onStop() {
        super.onStop();
    }
    @Override protected void onDestroy() {
        super.onDestroy();
    }
}
