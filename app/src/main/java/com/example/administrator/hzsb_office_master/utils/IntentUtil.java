package com.example.administrator.hzsb_office_master.utils;

import android.content.Context;
import android.content.Intent;

/**
 * Created by liujiancheng  on 2017/4/10.
 * 跳转activity
 */

public class IntentUtil {
    /*
   * 传递单个参数的
   * */
    public static void startIntentByOne(Context context, Class class1, String type){
        Intent intent = new Intent(context,class1);
        intent.putExtra("type",type);
        context.startActivity(intent);
    }
    /*
    * 传递多个参数的
    * */
}
