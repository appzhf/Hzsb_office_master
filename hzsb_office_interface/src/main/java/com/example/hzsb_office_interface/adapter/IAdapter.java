package com.example.hzsb_office_interface.adapter;

/**
 * Created by liujiancheng  on 2017/4/5.
 *
 * 项目名称: hzsb_office_interface
 * 包 名 称: com.example.hzsb_office_interface
 * 类 描 述: 扩展的Adapter接口规范
 */

public interface IAdapter<T> {

    void onUpdate(BaseAdapterHelper helper, T item, int position);

    int getLayoutResId(T item, int position);
}
