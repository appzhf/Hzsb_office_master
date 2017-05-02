package com.example.hzsb_office_interface.adapter;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by liujiancheng  on 2017/4/5.
 *
 * 项目名称: hzsb_office_interface
 * 包 名 称: com.example.hzsb_office_interface
 * 类 描 述: 网络图片加载接口规范
 */
public interface ImageLoad {

    void load(Context context, ImageView imageView, String imageUrl);
}
