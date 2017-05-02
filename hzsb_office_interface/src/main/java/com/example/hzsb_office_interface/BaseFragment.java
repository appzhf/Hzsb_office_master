package com.example.hzsb_office_interface;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.hzsb_office_interface.fragment.IFragment;
import com.example.hzsb_office_interface.server.IServer;

/**
 * Created by liujiancheng  on 2017/3/29.
 *
 */

public abstract class BaseFragment extends Fragment implements IFragment,IServer,View.OnClickListener{

    protected Activity mActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mActivity = getActivity();
        View view = inflater.inflate(getLayoutResId(),container,false);
        initView(view,savedInstanceState);
        initData();
        onChange();
        onFirst();
        showProgress();
        hideProgress();
        return  view;
    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Regist();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unRegister();
    }

    @Override public void onChange() {}
    @Override public void onHidden() {}
    @Override public void onFirst() {}
    @Override public void initData() {}
    @Override public void initView(View parentView, Bundle savedInstanceState) {}
    @Override public void viewClick(View v) {}
    @Override public void showProgress() {}
    @Override public void hideProgress() {}
    @Override public void Regist() {}
    @Override public void unRegister() {}

    @Override
    public void onClick(View v) {
        viewClick(v);
    }
}
