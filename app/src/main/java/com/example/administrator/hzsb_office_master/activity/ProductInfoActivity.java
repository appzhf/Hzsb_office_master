package com.example.administrator.hzsb_office_master.activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
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
import com.example.administrator.hzsb_office_master.entity.Product_name;
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

public class ProductInfoActivity extends AppBaseActivity {


    public static final String TAG = ProductInfoActivity.class.getSimpleName();
    @BindView(R.id.mList)                       ListView mListView;
    @BindView(R.id.productInfoRefreshableView)     RefreshableView mRefreshableView;
    ProductInfoAdapter iAdapter;
    List<Product_name> list;

    public static void start(Activity activity){
        activity.startActivity(new Intent(activity,ProductInfoActivity.class));
    }
    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mRefreshableView.finishRefresh();
            Utils.showToast(mAppContext,"已刷新成功！！！");
        }
    };


    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);

        String url = ServiceAddre.http+"/getProduct_nameInfoServlet";
        Request request = NoHttp.createStringRequest(url);
        NoHttpRequest(0, request, new OnResponseListener<String>() {
            @Override
            public void onStart(int what) {
                /**
                 * 此处做进度条的请求UI，暂时先放着
                 *
                 */
            }

            @Override
            public void onSucceed(int what, Response<String> response) {
                Headers headers = response.getHeaders();
                if(headers.getResponseCode() == 200){
                    list = GsonUtil.parseJsonAPIImpl(response.get().toString(),new TypeToken<List<Product_name>>(){}.getType());
                    System.out.println(list.toString());
                    iAdapter = new ProductInfoAdapter();
                    mListView.setAdapter(iAdapter);
                }
            }

            @Override
            public void onFailed(int what, Response<String> response) {
                Log.i(TAG,response.getException().getMessage());
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

    class ProductInfoAdapter extends BaseAdapter {

        LayoutInflater mLayoutInflater;
        public ProductInfoAdapter(){
            super();
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
            Tag tag = null;
            if(convertView == null){
                tag = new Tag();
                convertView = mLayoutInflater.inflate(R.layout.detection_list,null);
                tag.mImageView = (ImageView) convertView.findViewById(R.id.iv_head);
                tag.mTextView = (TextView) convertView.findViewById(R.id.tv_name);
                convertView.setTag(tag);
            }else{
                tag = (Tag) convertView.getTag();
            }
            tag.mImageView.setImageResource(HEAD_IDS[position%HEAD_IDS.length]);
            tag.mTextView.setText(list.get(position).getProduct_name_name());
            return convertView;
        }
    }

    public static final int[] HEAD_IDS = new int[]{
            R.drawable.normals,
            R.drawable.farlows,
            R.drawable.machine
    };
    class Tag{
        ImageView mImageView;
        TextView mTextView;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_product_info;
    }
}
