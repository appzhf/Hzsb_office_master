package com.example.administrator.hzsb_office_master.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by liujiancheng  on 2017/3/30.
 * 封装显示工具类
 */


public class ToastUtils {

    /**
     * Toast的封装
     */
    private static Toast mToast;
    public static void show(Context context,int ResId){
        if(mToast == null){
            mToast = Toast.makeText(context,context.getResources().getText(ResId),Toast.LENGTH_SHORT);
        }
        mToast.show();
    }
    /**
     *
     */

}
