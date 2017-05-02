package com.example.administrator.hzsb_office_master.utils;
import android.content.Context;

import com.example.administrator.hzsb_office_master.constant.StocksList;
import com.example.administrator.hzsb_office_master.entity.Get;
import com.example.administrator.hzsb_office_master.entity.Product;
import com.example.administrator.hzsb_office_master.entity.Product_login;
import com.example.administrator.hzsb_office_master.entity.Product_name;
import com.example.administrator.hzsb_office_master.entity.Stocks;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import rx.Observable;
import rx.Subscriber;

import static android.R.id.list;

/**
 * Created by liujiancheng  on 2017/3/31.
 *  异步请求
 */

public class ObserveUtiles {

    private static final String TAG = ObserveUtiles.class.getSimpleName();
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private OkHttpClient mClient;
    private Get get;
    private Product_login login;
    private JsonParseAPI mJsonParseAPI;
    Gson mGson;
    List<Product_name> pNameList ;
    List<Stocks> mStocksList;

    public ObserveUtiles(){
        mClient = new OkHttpClient();
        get = new Get();
        login = new Product_login();
        mJsonParseAPI = new JsonParseAPI();
        mGson = new Gson();
        pNameList = new ArrayList<>();
        mStocksList = new ArrayList<>();
    }

    /**
     * get工具类
     * @param path
     * @return
     */
    public Observable<Get> getMessage(final String path){
        return Observable.create(new Observable.OnSubscribe<Get>() {
            @Override
            public void call(Subscriber<? super Get> subscriber) {
                if(!subscriber.isUnsubscribed()){
                    Request request = new Request.Builder().url(path).build();
                    mClient.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            subscriber.onError(e);
                        }
                        @Override
                        public void onResponse(Call call, Response response) throws IOException {
                            if(response.isSuccessful()){
                                try {
                                    JSONArray array = new JSONArray(response.body().string());
                                    get.setGet_Serial_Id(array.getJSONObject(0).getInt("Get_Serial_Id"));
                                    get.setGet_Pick_Id(array.getJSONObject(0).getString("Get_Pick_Id"));
                                    get.setGet_Pick_Date(array.getJSONObject(0).getString("Get_Pick_Date"));
                                    get.setGet_Pick_User(array.getJSONObject(0).getString("Get_Pick_User"));
                                    get.setGet_IsPick(array.getJSONObject(0).getString("Get_IsPick"));
                                    get.setGet_Bz(array.getJSONObject(0).getString("Get_Bz"));
                                    if(get != null){
                                        subscriber.onNext(get);
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                            subscriber.onCompleted();
                        }
                    });
                }
            }
        });
    }

    /**
     * 登录工具类
     * @param path
     * @param params
     * @return
     */
    public Observable<Product_login> getLogin(final String path, HashMap<String,String> params){
        return Observable.create(new Observable.OnSubscribe<Product_login>() {
            @Override
            public void call(Subscriber<? super Product_login> subscriber) {
                if(!subscriber.isUnsubscribed()){
                  FormBody.Builder builder = new FormBody.Builder();
                    for (String key: params.keySet()) {
                        builder.add(key,params.get(key));
                    }
                    RequestBody body = builder.build();
                    Request request = new Request.Builder().url(path).post(body).build();
                    mClient.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            subscriber.onError(e);
                        }

                        @Override
                        public void onResponse(Call call, Response response) throws IOException {
                            if(response.isSuccessful()){
                                Product_login login = GsonUtil.parseJsonByGetLogin(response.body().string());
                                if(null != login){
                                    subscriber.onNext(login);
                                }
                            }
                            subscriber.onCompleted();
                        }
                    });

                }
            }
        });
    }

    public Observable<List<Product_name>> getProductInfo(String path){
            return Observable.create(new Observable.OnSubscribe<List<Product_name>>() {
                @Override
                public void call(Subscriber<? super List<Product_name>> subscriber) {
                    if(!subscriber.isUnsubscribed()){
                        Request request = new Request.Builder().url(path).build();
                        mClient.newCall(request).enqueue(new Callback() {
                            @Override
                            public void onFailure(Call call, IOException e) {
                                subscriber.onError(e);
                            }
                            @Override
                            public void onResponse(Call call, Response response) throws IOException {
                                if(response.isSuccessful()){
                                    JSONArray array = null;
                                    try {
                                        array = new JSONArray(response.body().string());
                                        Product_name pName = new Product_name();
                                        for (int i = 0; i < array.length(); i++) {
                                            pName.setProduct_name_id(array.getJSONObject(i).getString("Product_name_id"));
                                            pName.setProduct_name_name(array.getJSONObject(i).getString("Product_name_name"));
                                            pName.setProduct_name_bz(array.getJSONObject(i).getString("Product_name_bz"));
                                            pNameList.add(pName);
                                            System.out.println("111"+pNameList.get(i));
                                        }
                                        subscriber.onNext(pNameList);
                                    } catch (JSONException e) {
                                        System.out.println("e"+e.getMessage());
                                        e.printStackTrace();
                                    }
                                }
                                subscriber.onCompleted();
                            }
                        });
                    }
                }
            });
    }


    public Observable<List<Stocks>> getStocksInfo(String path){
        return Observable.create(new Observable.OnSubscribe<List<Stocks>>() {
            @Override
            public void call(Subscriber<? super List<Stocks>> subscriber) {
                if(!subscriber.isUnsubscribed()){
                    Request request = new Request.Builder().url(path).build();
                    mClient.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            subscriber.onError(e);
                            System.out.println("e:"+e.getMessage());
                        }

                        @Override
                        public void onResponse(Call call, Response response) throws IOException {
                            if(response.isSuccessful()){
                                List<Stocks> mislist = new ArrayList<>();
                                mislist = GsonUtil.parseJsonAPIImpl(response.body().string(),new TypeToken<List<Stocks>>(){}.getType());
                                System.out.println("mislist"+mislist.size());
                                System.out.println(mislist.get(0).getStocks_emergency_number());
                                subscriber.onNext(mislist);
                            }
                        }
                    });
                }
                subscriber.onCompleted();
            }
        });
    }

    /*
    * for (int i = 0; i < array.length() ; i++) {
                                        stocks.setStocks_materialCode(array.getJSONObject(i).getString("Stocks_materialCode"));
                                        stocks.setStocks_materialName(array.getJSONObject(i).getString("Stocks_materialName"));
                                        stocks.setStocks_supplier(array.getJSONObject(i).getString("Stocks_supplier"));
                                        stocks.setStocks_products(array.getJSONObject(i).getString("Stocks_products"));
                                        stocks.setStocks_storeAddress(array.getJSONObject(i).getString("Stocks_storeAddress"));
                                        stocks.setStocks_inventoryNumber(array.getJSONObject(i).getInt("Stocks_inventoryNumber"));
                                        stocks.setStocks_virtualNumber(array.getJSONObject(i).getInt("Stocks_virtualNumber"));
                                        stocks.setStocks_attrubute(array.getJSONObject(i).getString("Stocks_attrubute"));
                                        stocks.setStocks_inStockNumber(array.getJSONObject(i).getInt("Stocks_inStockNumber"));
                                        stocks.setStocks_remindNumber(array.getJSONObject(i).getInt("Stocks_remindNumber"));
                                        stocks.setStocks_outStockNumber(array.getJSONObject(i).getInt("Stocks_outStockNumber"));
                                        stocks.setStocks_emergency_number(array.getJSONObject(i).getInt("Stocks_emergency_number"));
                                        stocks.setStocks_bz(array.getJSONObject(i).getString("Stocks_bz"));
                                        mStocksList.add(stocks);
                                        System.out.println(mStocksList.get(i).getStocks_emergency_number());
                                    }*/

}
