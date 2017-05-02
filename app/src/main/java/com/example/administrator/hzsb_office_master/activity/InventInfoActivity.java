package com.example.administrator.hzsb_office_master.activity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.animation.RefreshableView;
import com.example.administrator.hzsb_office_master.base.AppBaseActivity;
import com.example.administrator.hzsb_office_master.constant.ServiceAddre;
import com.example.administrator.hzsb_office_master.entity.Stocks;
import com.example.administrator.hzsb_office_master.utils.GsonUtil;
import com.example.administrator.hzsb_office_master.utils.Utils;
import com.google.gson.reflect.TypeToken;
import com.yolanda.nohttp.NoHttp;
import com.yolanda.nohttp.rest.OnResponseListener;
import com.yolanda.nohttp.rest.Request;
import com.yolanda.nohttp.rest.Response;
import java.util.List;
import butterknife.BindView;

/**
 *
 * 文件描述：库存信息查询
 *
 *  @author liujiancheng
 *  @data 2017/4/21
 */

public class InventInfoActivity extends AppBaseActivity {


    public static final String TAG = InventInfoActivity.class.getSimpleName();

    @BindView(R.id.iventReshableView)       RefreshableView mRefreshableView;
    @BindView(R.id.iventListView)           ListView mListView;
    private List<Stocks> list;
    private MyInventAdapter iAdapter;


    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mRefreshableView.finishRefresh();
            Utils.showToast(mAppContext, "已刷新成功！！！");
        }
    };

    public static void start(Activity activity) {
        activity.startActivity(new Intent(activity, InventInfoActivity.class));
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String path = ServiceAddre.http + "/getStocksInfoServlet";
        Request request = NoHttp.createStringRequest(path);
        NoHttpRequest(0, request, new OnResponseListener<String>() {
            @Override
            public void onStart(int what) {

            }

            @Override
            public void onSucceed(int what, Response<String> response) {
                System.out.println(response.get());
                list = GsonUtil.parseJsonAPIImpl(response.get(), new TypeToken<List<Stocks>>() {
                }.getType());
                iAdapter = new MyInventAdapter();
                mListView.setAdapter(iAdapter);
            }

            @Override
            public void onFailed(int what, Response<String> response) {

            }

            @Override
            public void onFinish(int what) {

            }
        });

        mRefreshableView.setRefreshListener(new RefreshableView.RefreshListener() {
            @Override
            public void onRefresh(RefreshableView view) {
                mHandler.sendEmptyMessageDelayed(1, 3000);
            }
        });


    }

    class MyInventAdapter extends BaseAdapter {

        LayoutInflater mLayoutInflater;

        MyInventAdapter() {
            mLayoutInflater = LayoutInflater.from(activity);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            MyTag mt = null;
            if (convertView == null) {
                mt = new MyTag();
                convertView = mLayoutInflater.inflate(R.layout.detection_list, null);
                mt.mImageView = (ImageView) convertView.findViewById(R.id.iv_head);
                mt.adapterName = (TextView) convertView.findViewById(R.id.tv_name);
                mt.adapterPoint = (TextView) convertView.findViewById(R.id.tv_names);
                convertView.setTag(mt);
            } else {
                mt = (MyTag) convertView.getTag();
            }
            mt.mImageView.setImageResource(R.mipmap.ic_launcher);
            mt.adapterName.setText(list.get(position).getStocks_products());
            return convertView;
        }
    }

    class MyTag {
        ImageView mImageView;
        TextView adapterName, adapterPoint;
    }


    @Override
    public int getLayoutResId() {
        return R.layout.activity_invent_info;
    }
}
