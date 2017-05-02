package com.example.hzsb_office_interface.utils;

import android.content.Context;
import android.content.SharedPreferences;

import org.androidannotations.api.sharedpreferences.SharedPreferencesCompat;


/**
 * Created by liujiancheng  on 2017/3/29.
 *  标准SharedPreferences数据工具类
 */

public class SpshareUtil {

    /*
    *   获取SpshareUtil的name
    * */
    public static String getSpshareName(Context context){
        return context.getPackageName()+"_sp";
    }
    /*
    * 根据不同的类型存放不同的值
    * */
    public static void putSpshare(Context context,String key,Object object ){
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSpshareName(context),Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if(object instanceof String ){
            edit.putString(key, (String) object);
        }else if(object instanceof Integer){
            edit.putInt(key, (Integer) object);
        }else if(object instanceof Float){
            edit.putFloat(key, (Float) object);
        }else if(object instanceof Long){
            edit.putLong(key, (Long) object);
        }else if(object instanceof Boolean){
            edit.putBoolean(key, (Boolean) object);
        }else{
            edit.putString(key,object.toString());
        }

        SharedPreferencesCompat.apply(edit);
    }


    /*
    * 获取数据的方式
    * */
    public static Object getSpshare(Context context,String key,Object object){
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSpshareName(context),Context.MODE_PRIVATE);

        if(object instanceof String){
            return sharedPreferences.getString(key, (String) object);
        }else if(object instanceof Integer){
            return sharedPreferences.getInt(key, (Integer) object);
        }else if(object instanceof Float){
            return sharedPreferences.getFloat(key, (Float) object);
        }else if(object instanceof Long){
            return sharedPreferences.getLong(key, (Long) object);
        }else if(object instanceof Boolean){
            return sharedPreferences.getBoolean(key, (Boolean) object);
        }else{
            return null;
        }
    }

    /*
    *删除SharedPreferences的某条数据 带key
    * */
    public static void remove(Context context,String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSpshareName(context),Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(key);
        SharedPreferencesCompat.apply(editor);
    }

    /*
    * 删除SharedPreferences的全部数据
    * */
    public static void removeAll(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSpshareName(context),Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        SharedPreferencesCompat.apply(editor);
    }

    /**
     * 删除SharedPreferences的某条数据
     *
     */
    public static void removeOne(Context context,String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSpshareName(context),Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(key);
        SharedPreferencesCompat.apply(editor);
    }




}
