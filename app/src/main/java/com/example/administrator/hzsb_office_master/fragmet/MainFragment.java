package com.example.administrator.hzsb_office_master.fragmet;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.activity.InventInfoActivity;
import com.example.administrator.hzsb_office_master.activity.MaterialProductActivity;
import com.example.administrator.hzsb_office_master.activity.ProductInfoActivity;
import com.example.administrator.hzsb_office_master.adapter.CommonRecyclerAdapter;
import com.example.administrator.hzsb_office_master.adapter.MessageDetailAdapter;
import com.example.administrator.hzsb_office_master.adapter.ImagePageAdapter;
import com.example.administrator.hzsb_office_master.animation.LayoutAnimation;
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;
import com.example.administrator.hzsb_office_master.utils.ToastUtils;
import com.example.administrator.hzsb_office_master.utils.Utils;
import com.jakewharton.rxbinding.widget.RxAdapterView;
import com.jude.rollviewpager.OnItemClickListener;
import com.jude.rollviewpager.RollPagerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import rx.Observable;
import rx.functions.Action1;

/**
 *
 * @author liujiancheng
 * @date 2017/4/5
 */
public class MainFragment extends AppBaseFragment implements CommonRecyclerAdapter.OnItemClickListener,CommonRecyclerAdapter.OnItemLongClickListener {


    @BindView(R.id.office_gridView)      GridView mGridView;
    @BindView(R.id.main_recycler_view)   RecyclerView mRecyclerView;
    @BindView(R.id.rollPagerView)         RollPagerView mRollPagerView;

    private SimpleAdapter mSimpleAdapter;
    private MessageDetailAdapter mMessageDetailAdapter;

    public static MainFragment getInstance(){
        return new MainFragment();

    }

    @Override public void onFirst() {
        super.onFirst();
    }


    @Override public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);
        getViewPagers();
        initData();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mAppContext));

    }

    private void getViewPagers() {
        System.out.println("0123"+mRollPagerView);
        mRollPagerView.setAdapter(ImagePageAdapter.getInstance());
        mRollPagerView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Utils.showToast(mAppContext,"点击了第"+position+"个");
            }
        });
    }




    @Override public void initData() {
        super.initData();
        mSimpleAdapter = new SimpleAdapter(mAppContext,getdata(),R.layout.item,new String[]{"image","title"},new int[]{R.id.image_item,R.id.text_item});
        mGridView.setAdapter(mSimpleAdapter);
        RxAdapterView.itemClicks(mGridView)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        switch (integer){
                            case 0:
                                MaterialProductActivity.start(mActivity);
                                break;
                            case 1:
                                InventInfoActivity.start(mActivity);
                                break;
                            case 2:
                                ProductInfoActivity.start(mActivity);
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            default:
                                break;
                        }
                    }
                });
    }


    public List<Map<String,Object>> getdata(){
        List<Map<String,Object>> list = new ArrayList<>();
        String icon_name [] = new String[]{"查阅进度","库存信息","产品信息","任务日志","公司信息","留言功能","联系方式","全部功能"};
        int icon_photo [] = new int[]{
                R.drawable.office_order,
                R.drawable.office_check,
                R.drawable.office_buy,
                R.drawable.office_product,
                R.drawable.office_querty,
                R.drawable.office_instore,
                R.drawable.office_send,
                R.drawable.office_find
            };

        for (int i = 0; i < icon_name.length ; i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("image",icon_photo[i]);
            map.put("title",icon_name[i]);
            list.add(map);
        }
        return list;
    }


    @Override
    public int getLayoutResId() {
        return R.layout.activity_main_fragment;
    }


    @Override public void onItemClick(RecyclerView.ViewHolder viewHolder, View view, int position) {

    }

    @Override public void onItemLongClick(RecyclerView.ViewHolder viewHolder, View view, int position) {

    }
}
