package com.example.administrator.hzsb_office_master.fragmet;

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
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;
import com.example.administrator.hzsb_office_master.constant.ServiceAddre;
import com.example.administrator.hzsb_office_master.entity.Stocks_log;
import com.example.administrator.hzsb_office_master.utils.GsonUtil;
import com.example.administrator.hzsb_office_master.utils.Utils;
import com.google.gson.reflect.TypeToken;
import com.yolanda.nohttp.Headers;
import com.yolanda.nohttp.NoHttp;
import com.yolanda.nohttp.rest.OnResponseListener;
import com.yolanda.nohttp.rest.Request;
import com.yolanda.nohttp.rest.Response;

import java.util.List;

import butterknife.BindView;

/**
 * Created by liujiancheng  on 2017/4/19.
 */

public class JobLogFragment extends AppBaseFragment{



    @BindView(R.id.joblogRefreshableView)           RefreshableView mRefreshableView;
    @BindView(R.id.joblogListView)                   ListView mListView;
    List<Stocks_log> list;
    JobLogAdapter mAdapter;

    public static JobLogFragment getInstance(){
        return new JobLogFragment();
    }

    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mRefreshableView.finishRefresh();
            Utils.showToast(mAppContext,"Ë¢ÐÂ³É¹¦£¡£¡£¡");
        }
    };

    @Override
    public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);
        String url = ServiceAddre.http+"/getStocksLogsServlet";
        Request request = NoHttp.createStringRequest(url);
        NoHttpRequest(0, request, new OnResponseListener() {
            @Override
            public void onStart(int what) {

            }
            @Override
            public void onSucceed(int what, Response response) {
                Headers headers = response.getHeaders();
                if(headers.getResponseCode() == 200){
                    list = GsonUtil.parseJsonAPIImpl(response.get().toString(),new TypeToken<List<Stocks_log>>(){}.getType());
                    mAdapter = new JobLogAdapter();
                    mListView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onFailed(int what, Response response) {
                System.out.println(response.getException().getMessage());
            }
            @Override
            public void onFinish(int what) {

            }
        });
        mRefreshableView.setRefreshListener(new RefreshableView.RefreshListener() {
            @Override
            public void onRefresh(RefreshableView view) {
                mHandler.sendEmptyMessageDelayed(1,3000);
            }
        });
    }

    class JobLogAdapter extends BaseAdapter{


        LayoutInflater mLayoutInflater;
        JobLogAdapter(){
            mLayoutInflater = LayoutInflater.from((mActivity));
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
            JobLog log = null;
            if(convertView == null){
                log = new JobLog();
                convertView = mLayoutInflater.inflate(R.layout.detection_list,null);
                log.mImageView  = (ImageView) convertView.findViewById(R.id.iv_head);
                log.mTextView = (TextView) convertView.findViewById(R.id.tv_name);
                log.xTextView = (TextView) convertView.findViewById(R.id.tv_names);
                convertView.setTag(log);
            }else{
                log = (JobLog) convertView.getTag();
            }
            log.mImageView.setImageResource(R.drawable.joblog);
            log.mTextView.setText(list.get(position).getStocks_log_materialName());
            log.mTextView.setText(list.get(position).getStocks_log_operationUser());
            return convertView;
        }
    }
    class JobLog{
        TextView mTextView,xTextView;
        ImageView mImageView;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_joblog;
    }
}
