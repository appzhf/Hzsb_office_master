package com.example.administrator.hzsb_office_master.utils;

import com.example.administrator.hzsb_office_master.entity.Client;

import retrofit.http.Body;
import retrofit.http.GET;
import rx.Observable;

/**
 * Created by liujiancheng  on 2017/4/24.
 * Rxjava和Retrofit相结合的网络请求接口
 */

public interface OrderServer {

    @GET("top250")
    Observable<Client> ClientInfo(@Body boolean mboolean);
}
