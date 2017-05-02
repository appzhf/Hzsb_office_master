package com.example.hzsb_office_interface.server;

/**
 * Created by liujiancheng  on 2017/3/29.
 * 标准服务类接口
 */

public interface IServer {
    /**
     * 服务开启接口
     */
    void Regist();
    /**
     * 服务关闭接口
     */
    void unRegister();
}
