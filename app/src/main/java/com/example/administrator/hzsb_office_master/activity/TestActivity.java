package com.example.administrator.hzsb_office_master.activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.hzsb_office_master.MainActivity;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.fragmet.AboutFragment;
import com.example.administrator.hzsb_office_master.fragmet.ChartFragment;
import com.example.administrator.hzsb_office_master.fragmet.MainFragment;
import com.example.administrator.hzsb_office_master.fragmet.TimelineFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by liujiancheng  on 2017/3/29.
 */

public class TestActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.myCoordinator)CoordinatorLayout mCoordinatorLayout;
    @BindView(R.id.viewPager)ViewPager mViewPager;
    private BottomBar mBottomBar;
    private List<Fragment> mFragmentList;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("123456");
        ButterKnife.bind(this);
        setTitle(R.string.foods);
        initViewPage();
        createBottomBar(savedInstanceState);
    }


    private void initViewPage() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(MainFragment.getInstance());
        mFragmentList.add(AboutFragment.getInstance());
        mFragmentList.add(ChartFragment.getInstance());
        mFragmentList.add(TimelineFragment.getInstance());
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
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }


            @Override
            public void onPageSelected(int position) {
                mBottomBar.selectTabAtPosition(position,true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



    private void createBottomBar(Bundle savedInstanceState) {
        mBottomBar =BottomBar.attachShy(mCoordinatorLayout,mViewPager,savedInstanceState);
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

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        mBottomBar.onSaveInstanceState(outState);
    }
}
