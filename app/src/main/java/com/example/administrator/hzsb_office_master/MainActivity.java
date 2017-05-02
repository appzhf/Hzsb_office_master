package com.example.administrator.hzsb_office_master;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.example.administrator.hzsb_office_master.base.AppBaseActivity;
import com.example.administrator.hzsb_office_master.fragmet.ChartFragment;
import com.example.administrator.hzsb_office_master.fragmet.MainFragment;
import com.example.administrator.hzsb_office_master.fragmet.MenuFragment;
import com.example.administrator.hzsb_office_master.fragmet.TimelineFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;
import com.tbruyelle.rxpermissions.RxPermissions;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import rx.functions.Action1;

/**
 * @author liujiancheng
 *         第一个界面
 */
public class MainActivity extends AppBaseActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.myCoordinator)
    CoordinatorLayout mCoordinatorLayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    private BottomBar mBottomBar;
    private List<Fragment> mFragmentList;
    private RxPermissions mRxPermissions;

    public static void start(Activity activity) {
        activity.startActivity(new Intent(activity, MainActivity.class));
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        Log.i(TAG, "initView");
        setTitle(R.string.app_name);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            mRxPermissions = new RxPermissions(MainActivity.this);
            mRxPermissions.request(Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_PHONE_STATE)
                    .subscribe(new Action1<Boolean>() {
                        @Override
                        public void call(Boolean aBoolean) {
                            if (!aBoolean) {
                                Log.i(TAG, "request permission");
                                initPre();
                            }
                        }
                    });
        }
        initdata();
        mBottomBar = BottomBar.attachShy(mCoordinatorLayout, mViewPager, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.bottombar_menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                switch (menuItemId) {
                    case R.id.bb_menu_recents:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.bb_menu_favorites:
                        mViewPager.setCurrentItem(1);
                        break;
                    case R.id.bb_menu_nearby:
                        mViewPager.setCurrentItem(2);
                        break;
                    case R.id.bb_menu_friends:
                        mViewPager.setCurrentItem(3);
                        break;
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
            }
        });
        mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.color_recents));
        mBottomBar.mapColorForTab(1, ContextCompat.getColor(this, R.color.color_favorites));
        mBottomBar.mapColorForTab(2, ContextCompat.getColor(this, R.color.color_nearby));
        mBottomBar.mapColorForTab(3, ContextCompat.getColor(this, R.color.color_friends));
    }

    /**
     * 第一次加载程序时初始化
     */
    @Override
    public void initFirst() {
        super.initFirst();
        //初始化greenDao
    }

    @Override
    public void initPre() {
        super.initPre();

    }

    @Override
    public void initdata() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(MainFragment.getInstance());
        mFragmentList.add(MenuFragment.getInstance());
        mFragmentList.add(ChartFragment.getInstance());
        mFragmentList.add(TimelineFragment.getInstance());
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragmentList.get(position);
            }

            @Override
            public int getCount() {
                return mFragmentList.size();
            }
        });
        /*
        mViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragmentList.get(position);
            }

            @Override
            public int getCount() {
                return mFragmentList.size();
            }
        });
        */
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mBottomBar.selectTabAtPosition(position, true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        super.initdata();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        mBottomBar.onSaveInstanceState(outState);
    }
}
