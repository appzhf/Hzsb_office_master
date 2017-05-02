package com.example.administrator.hzsb_office_master.activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseActivity;
import com.example.administrator.hzsb_office_master.constant.ServiceAddre;
import com.example.administrator.hzsb_office_master.entity.Client;
import com.example.administrator.hzsb_office_master.utils.OrderServer;
import butterknife.BindView;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 文件描述：下单界面
 * @author liujiancheng
 * @date 2014/4/24
 *
 */
public class OrderActivity extends AppBaseActivity {

    @BindView(R.id.orderEdit) EditText mEditText;
    @BindView(R.id.orderList) ListView mListView;

    public static void start(Activity activity){
        activity.startActivity(new Intent(activity,OrderActivity.class));
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String url = ServiceAddre.http+"/getClientInfoServlet";
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        OrderServer orderServer = retrofit.create(OrderServer.class);
        Observable<Client> observable = orderServer.ClientInfo(true);
        observable.subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Client>() {
            @Override
            public void onCompleted() {

            }
            @Override
            public void onError(Throwable e) {

            }
            @Override
            public void onNext(Client client) {

            }
        });
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_order;
    }
}
