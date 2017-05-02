package com.example.administrator.hzsb_office_master.constant;

import com.example.administrator.hzsb_office_master.entity.Stocks;

import java.util.List;

/**
 * Created by liujiancheng  on 2017/4/14.
 */

public class StocksList {
    List<Stocks> list;

    public StocksList(){

    }

    public StocksList(List<Stocks> list) {
        this.list = list;
    }

    public List<Stocks> getList() {
        return list;
    }

    public void setList(List<Stocks> list) {
        this.list = list;
    }
}
