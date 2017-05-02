package com.example.administrator.hzsb_office_master.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.animation.RefreshableView;
import com.example.administrator.hzsb_office_master.base.AppBaseActivity;
import com.example.administrator.hzsb_office_master.constant.ServiceAddre;
import com.example.administrator.hzsb_office_master.entity.Product;
import com.example.administrator.hzsb_office_master.utils.GsonUtil;
import com.example.administrator.hzsb_office_master.utils.ObserveUtiles;
import com.example.administrator.hzsb_office_master.utils.Utils;
import com.google.gson.reflect.TypeToken;
import com.yolanda.nohttp.Headers;
import com.yolanda.nohttp.NoHttp;
import com.yolanda.nohttp.rest.OnResponseListener;
import com.yolanda.nohttp.rest.Request;
import com.yolanda.nohttp.rest.Response;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author liujiancheng 2017/4/11
 *         类名: MaterialProductActivity
 *         文件描述：查阅进度界面，包括进度查询，库存查询，产品信息查询，任务单日志
 */
public class MaterialProductActivity extends AppBaseActivity implements RefreshableView.RefreshListener {

    public final String TAG = MaterialProductActivity.class.getSimpleName();
    public String path = ServiceAddre.http + "/getProductInfoServlet";
    @BindView(R.id.referProgress)
    RelativeLayout referProgress;
    @BindView(R.id.referInventory)
    RelativeLayout referInventory;
    @BindView(R.id.productMessage)
    RelativeLayout productMessage;
    @BindView(R.id.taskLog)
    RelativeLayout taskLog;
    @BindView(R.id.text_referProgress)
    TextView text_referProgress;
    @BindView(R.id.text_referInventory)
    TextView text_referInventory;
    @BindView(R.id.text_productMessage)
    TextView text_productMessage;
    @BindView(R.id.text_taskLog)
    TextView text_taskLog;
    @BindView(R.id.imageChoose1)
    ImageView imageChoose1;
    @BindView(R.id.imageChoose2)
    ImageView imageChoose2;
    @BindView(R.id.imageChoose3)
    ImageView imageChoose3;
    @BindView(R.id.imageChoose4)
    ImageView imageChoose4;
    @BindView(R.id.refreshRoot)
    RefreshableView refreshRoot;
    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;

    List<ImageView> mImageViewList = new ArrayList<>();
    List<TextView> mTextViewList = new ArrayList<>();
    List<RelativeLayout> mRelativeList = new ArrayList<>();
    ObserveUtiles mObserveUtiles;
    MyRecyclerAdapter mAdapter;
    List<Product> list = new ArrayList<>();

    public static void start(Activity activity) {
        activity.startActivity(new Intent(activity, MaterialProductActivity.class));
    }

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            refreshRoot.finishRefresh();
            Utils.showToast(mAppContext, "刷新完成！！！");
        }
    };

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        mObserveUtiles = new ObserveUtiles();
        initdata();
        refreshRoot.setRefreshListener(this);
        String path = ServiceAddre.http + "/getProduct_nameInfoServlet";
    }

    @Override
    public void initdata() {
        super.initdata();
        mImageViewList.add(imageChoose1);
        mImageViewList.add(imageChoose2);
        mImageViewList.add(imageChoose3);
        mImageViewList.add(imageChoose4);
        mRelativeList.add(referProgress);
        mRelativeList.add(referInventory);
        mRelativeList.add(productMessage);
        mRelativeList.add(taskLog);
        mTextViewList.add(text_referProgress);
        mTextViewList.add(text_referInventory);
        mTextViewList.add(text_productMessage);
        mTextViewList.add(text_taskLog);
        changButtonStyle(0);
    }

    @OnClick({R.id.referProgress, R.id.referInventory, R.id.productMessage, R.id.taskLog})
    public void FabOnclick(View view) {
        switch (view.getId()) {
            case R.id.referProgress:
                LoadDataNetWork(path);
                changButtonStyle(0);
                break;
            case R.id.referInventory:
                //path = ServiceAddre.http+"/getStocksInfoServlet";
                LoadDataNetWork(path);
                changButtonStyle(1);
                break;
            case R.id.productMessage:
                //path = ServiceAddre.http+"/getProduct_nameInfoServlet";
                changButtonStyle(2);
                break;
            case R.id.taskLog:
                LoadDataNetWork(path);
                changButtonStyle(3);
                break;
        }
    }

    private void LoadDataNetWork(String url) {
        Request request = NoHttp.createStringRequest(url);
        NoHttpRequest(0, request, new OnResponseListener<String>() {
            @Override
            public void onStart(int what) {

            }

            @Override
            public void onSucceed(int what, Response<String> response) {
                Headers heads = response.getHeaders();
                if (heads.getResponseCode() == 200) {
                    list = GsonUtil.parseJsonAPIImpl(response.get(), new TypeToken<List<Product>>() {
                    }.getType());
                    mRecyclerView.setLayoutManager(new LinearLayoutManager(mAppContext));
                    mAdapter = new MyRecyclerAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onFailed(int what, Response<String> response) {
                System.out.println(response.getException());
            }

            @Override
            public void onFinish(int what) {

            }
        });
    }

    /**
     * @param position
     */
    private void changButtonStyle(int position) {
        for (int i = 0; i < mImageViewList.size(); i++) {
            mImageViewList.get(i).setBackgroundColor(0xffE2E2E2);
            mRelativeList.get(i).setBackgroundColor(0xffF9F9F9);
            mTextViewList.get(i).setTextColor(0xff706F70);
        }
        mImageViewList.get(position).setBackgroundColor(0xff75AD02);
        mRelativeList.get(position).setBackgroundColor(0xffEEEEEE);
        mTextViewList.get(position).setTextColor(0xff75AD02);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_material_product;
    }

    @Override
    public void onRefresh(RefreshableView view) {
        mHandler.sendEmptyMessageDelayed(1, 2000);
    }

    class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHold> {


        @Override
        public MyViewHold onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHold hold = new MyViewHold(LayoutInflater.from(mAppContext).inflate(R.layout.list_item_swipe, parent, false));
            return hold;
        }

        @Override
        public void onBindViewHolder(MyViewHold holder, int position) {
            holder.text.setText(list.get(position).getProduct_name());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyViewHold extends RecyclerView.ViewHolder {
            TextView text;

            public MyViewHold(View itemView) {
                super(itemView);
                text = (TextView) itemView.findViewById(R.id.tv_name);
            }
        }

    }
}
