package com.example.administrator.hzsb_office_master.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.entity.Get;
import com.example.administrator.hzsb_office_master.utils.ObserveUtiles;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MaterialServerActivity extends AppCompatActivity {
    ObserveUtiles mUtiles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_server);
        System.out.println("onCreate");
        mUtiles = new ObserveUtiles();
    }
    public void start(View view){
        String path = "http://192.168.8.175:8080/Hzsb_office/getCustomerInfoServlet";
        String paths = "http://p2.so.qhimgs1.com/sdr/720_1080_/t01d713cf1ad6717772.jpg";
        mUtiles.getMessage(path).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Get>() {
            @Override
            public void onCompleted() {
                System.out.println("complented");
            }
            @Override
            public void onError(Throwable e) {
            }
            @Override
            public void onNext(Get get) {
                System.out.println("get"+get.getGet_Bz());
            }
        });
    }


}
