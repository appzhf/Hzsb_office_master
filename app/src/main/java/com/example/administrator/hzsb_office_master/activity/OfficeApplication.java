package com.example.administrator.hzsb_office_master.activity;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.yanzhenjie.nohttp.OkHttpNetworkExecutor;
import com.yolanda.nohttp.NoHttp;

/**
 * Created by liujiancheng  on 2017/3/29.
 *
 */

public class OfficeApplication extends Application{

    public OfficeApplication(){
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initImageLoader(this);
        NoHttp.Config config = new NoHttp.Config();
        config.setConnectTimeout(5000);
        config.setNetworkExecutor(new OkHttpNetworkExecutor());
        NoHttp.initialize(this,config);
    }

    private void initImageLoader(OfficeApplication officeApplication) {
        ImageLoaderConfiguration config =
                new ImageLoaderConfiguration.Builder(officeApplication).threadPoolSize(5).build();
        ImageLoader.getInstance().init(config);
    }
}
