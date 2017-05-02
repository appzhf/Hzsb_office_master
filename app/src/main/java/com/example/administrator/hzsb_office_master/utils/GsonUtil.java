package com.example.administrator.hzsb_office_master.utils;

import com.example.administrator.hzsb_office_master.entity.Get;
import com.example.administrator.hzsb_office_master.entity.Product_login;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;

import java.lang.reflect.Type;

/**
 * 文件描述 ：gson解析工具 提供泛型参数
 * Created by liujiancheng  on 2017/4/10.
 */

public class GsonUtil {
    /**
     * 方法描述：gson自动解析
     * @param jsonData
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T parseJsonAPIImpl(String jsonData, Type type) {
        Gson gson = new Gson();
        T result = gson.fromJson(jsonData, type);
        return result;
    }

    /**
     *方法描述 ：手动解析json 类：Get
     * @param json
     * @return
     */
    public static Get parseJsonByGetMessage(String json){
        Get get = new Get();
        try {
            JSONArray array = new JSONArray(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return get;
    }

    /**
     * 方法描述 ：手动解析json 类：Product_login
     * @param json
     * @return
     */
    public static Product_login parseJsonByGetLogin(String json){
        Product_login login = new Product_login();
        JSONArray array = null;
        try {
            array = new JSONArray(json);
            login.setProduct_login_loginName(array.getJSONObject(0).getString("Product_login_loginName"));
            login.setProduct_login_loginPwd(array.getJSONObject(0).getString("Product_login_loginPwd"));
            login.setProduct_login_realName(array.getJSONObject(0).getString("Product_login_realName"));
            login.setProduct_login_permission(array.getJSONObject(0).getString("Product_login_permission"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return login;
    }

}
