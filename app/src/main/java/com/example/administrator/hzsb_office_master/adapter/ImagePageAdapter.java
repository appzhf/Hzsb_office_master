package com.example.administrator.hzsb_office_master.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.hzsb_office_master.R;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;

/**
 * Created by liujiancheng  on 2017/4/5.
 *
 * 图片轮播适配
 */

public class ImagePageAdapter extends StaticPagerAdapter {

    private int images[] = {
            R.drawable.homeimage1,
            R.drawable.homeimage2,
            R.drawable.homeimage3,
            R.drawable.homeimage4,
    };

    public static ImagePageAdapter getInstance(){
        return new ImagePageAdapter();
    }



    @Override
    public View getView(ViewGroup container, int position) {
        ImageView imageView = new ImageView(container.getContext());
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return imageView;
    }

    @Override
    public int getCount() {
        return images.length;
    }


}
