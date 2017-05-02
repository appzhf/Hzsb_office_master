package com.example.administrator.hzsb_office_master.activity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.administrator.hzsb_office_master.MainActivity;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseActivity;
import com.example.administrator.hzsb_office_master.constant.ServiceAddre;
import com.example.administrator.hzsb_office_master.entity.Product_login;
import com.example.administrator.hzsb_office_master.utils.ObserveUtiles;
import com.example.administrator.hzsb_office_master.utils.ToastUtils;
import com.example.hzsb_office_interface.utils.SpshareUtil;

import java.util.HashMap;
import butterknife.BindView;
import butterknife.OnClick;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author liujiancheng
 * @date 2017/4/1
 * 登录界面
 */
public class LoginActivity extends AppBaseActivity {


    @BindView(R.id.username_et)                     EditText username_et;
    @BindView(R.id.password_et)                     EditText password_et;
    @BindView(R.id.button_login)                    Button button_login;
    private ObserveUtiles utils ;
    @Override public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        utils = new ObserveUtiles();


    }
    @Override public void initdata() {
        super.initdata();
    }
    @Override public void viewClick() {
        super.viewClick();

    }
    @OnClick(R.id.button_login) public void onclick(View v){
        if(!CheckNetWork()){
            ToastUtils.show(mAppContext, R.string.checkNetWork);
        }else if(username_et.getText().toString().equals("")||password_et.getText().toString().equals("")){
            ToastUtils.show(mAppContext,R.string.mobile_input_isnull);
        }
        String path = ServiceAddre.http+"/getLoginInfoServlet";
        HashMap<String,String> params = new HashMap<>();
        params.put("name",username_et.getText().toString().trim());
        params.put("pwd",password_et.getText().toString().trim());
        utils.getLogin(path,params).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Product_login>() {
            @Override
            public void onCompleted() {
            }
            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onNext(Product_login product_login) {
                if(null != product_login.getProduct_login_permission() || "".equals(product_login.getProduct_login_permission())){
                    SpshareUtil.putSpshare(mAppContext,"type",product_login.getProduct_login_permission());
                    MainActivity.start(activity);
                }else{
                    ToastUtils.show(mAppContext,R.string.mobile_check_isError);
                }

            }
        });


    }
    @Override public int getLayoutResId() {
        return R.layout.activity_login;
    }
    /**
     *
     * @return
     */private boolean CheckNetWork(){
        ConnectivityManager conn = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if(conn != null){
            return conn.getActiveNetworkInfo().isAvailable();
        }
        return false;
    }


}
