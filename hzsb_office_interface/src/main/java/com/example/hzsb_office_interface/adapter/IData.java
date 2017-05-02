package com.example.hzsb_office_interface.adapter;

import java.util.List;

/**
 * Created by liujiancheng  on 2017/4/5.
 *
 * 项目名称: hzsb_office_interface
 * 包 名 称: com.example.hzsb_office_interface
 * 类 描 述: 数据操作接口规范
 */

public interface IData<T> {

    void add(T elem);

    void addAll(List<T> elem);

    void set(T oldElem, T newElem);

    void set(int index, T elem);

    void remove(T elem);

    void remove(int index);

    void replaceAll(List<T> elem);

    boolean contains(T elem);

    void clear();

}
