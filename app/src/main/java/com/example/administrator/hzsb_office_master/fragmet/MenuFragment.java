package com.example.administrator.hzsb_office_master.fragmet;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.activity.OrderActivity;
import com.example.administrator.hzsb_office_master.animation.LayoutAnimation;
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;
import com.example.administrator.hzsb_office_master.constant.ServiceAddre;
import com.jakewharton.rxbinding.widget.RxAdapterView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

/**
 * Created by liujiancheng  on 2017/4/14.
 * 菜单页面
 */

public class MenuFragment extends AppBaseFragment{

    @BindView(R.id.menuGridView)GridView mGridView;
    private String [] icon_name = {"下单","审核","采购","生产","质检","入库","发货","查阅进度","权限设置","留言板","帮助"};
    private int [] icon_photo = {
            R.mipmap.office_order,
            R.mipmap.office_audio,
            R.mipmap.office_buy,
            R.mipmap.office_product,
            R.mipmap.office_quarty,
            R.mipmap.office_instorge,
            R.mipmap.office_sendmail,
            R.mipmap.office_findby,
            R.mipmap.office_typeset,
            R.mipmap.office_liuchat,
            R.mipmap.office_help
    };
    private SimpleAdapter adapter;
    public static MenuFragment getInstance(){
        return new MenuFragment();
    }
    @Override
    public void initView(View parentView, Bundle savedInstanceState) {
        super.initView(parentView, savedInstanceState);
        mGridView.setLayoutAnimation(LayoutAnimation.getAnimationController());
        adapter = new SimpleAdapter(mAppContext,getdata("高级管理员"),R.layout.item,new String[]{"image","text"},new int[]{R.id.image_item,R.id.text_item});
        mGridView.setAdapter(adapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (icon_photo[position]){
                    case R.mipmap.office_order:
                        OrderActivity.start(mActivity);
                        break;
                    case R.mipmap.office_audio:
                        break;
                    case R.mipmap.office_buy:
                        break;
                    case R.mipmap.office_product:
                        break;
                    case R.mipmap.office_quarty:
                        break;
                    case R.mipmap.office_instorge:
                        break;
                    case R.mipmap.office_sendmail:
                        break;
                    case R.mipmap.office_findby:
                        break;
                    case R.mipmap.office_typeset:
                        break;
                    case R.mipmap.office_liuchat:
                        break;
                    case R.mipmap.office_help:
                        break;
                    default:
                        break;
                }
            }
        });

    }
    public List<Map<String,Object>> getdata(String permission) {
        List<Map<String, Object>> list = new ArrayList<>();
        if (permission.equals(ServiceAddre.GAOPERMISSION)||permission.equals(ServiceAddre.ZHONGPERMISSION)||permission.equals(ServiceAddre.PUTONGPERMISSION)) {
            icon_name = new String[]{"下单","审核","采购","生产","质检","入库","发货","查阅进度","权限设置","留言板","帮助"};
            icon_photo = new int[]{
                    R.mipmap.office_order,
                    R.mipmap.office_audio,
                    R.mipmap.office_buy,
                    R.mipmap.office_product,
                    R.mipmap.office_quarty,
                    R.mipmap.office_instorge,
                    R.mipmap.office_sendmail,
                    R.mipmap.office_findby,
                    R.mipmap.office_typeset,
                    R.mipmap.office_liuchat,
                    R.mipmap.office_help};
        } else if (permission.equals(ServiceAddre.XIADANPERMISSION)) {
            icon_name = new String[]{"下单","查阅进度","权限设置","留言板","帮助"};
            icon_photo = new int[]{
                    R.mipmap.office_order,
                    R.mipmap.office_findby,
                    R.mipmap.office_typeset,
                    R.mipmap.office_liuchat,
                    R.mipmap.office_help};
        } else if (permission.equals(ServiceAddre.JIANPERMISSION)){
            icon_name = new String[]{"质检","查阅进度","权限设置","留言板","帮助"};
            icon_photo = new int[]{
                    R.mipmap.office_quarty,
                    R.mipmap.office_findby,
                    R.mipmap.office_typeset,
                    R.mipmap.office_liuchat,
                    R.mipmap.office_help};
        }else if(permission.equals(ServiceAddre.GOUPERMISSION)){
            icon_name = new String[]{"采购","查阅进度","权限设置","留言板","帮助"};
            icon_photo = new int[]{
                    R.mipmap.office_buy,
                    R.mipmap.office_findby,
                    R.mipmap.office_typeset,
                    R.mipmap.office_liuchat,
                    R.mipmap.office_help};

        }else if(permission.equals(ServiceAddre.SENDPERMISSION)){
            icon_name = new String[]{"发货","查阅进度","权限设置","留言板","帮助"};
            icon_photo = new int[]{
                    R.mipmap.office_sendmail,
                    R.mipmap.office_findby,
                    R.mipmap.office_typeset,
                    R.mipmap.office_liuchat,
                    R.mipmap.office_help};
        }else if(permission.equals(ServiceAddre.FAHUOPERMISSION)){
            icon_name = new String[]{"入库","查阅进度","权限设置","留言板","帮助"};
            icon_photo = new int[]{
                    R.mipmap.office_instorge,
                    R.mipmap.office_findby,
                    R.mipmap.office_typeset,
                    R.mipmap.office_liuchat,
                    R.mipmap.office_help};
        }
        for (int i = 0; i < icon_name.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image", icon_photo[i]);
            map.put("text", icon_name[i]);
            list.add(map);
        }
        return list;

    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_menu;
    }
}
