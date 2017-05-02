package com.example.administrator.hzsb_office_master.fragmet;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;


public class ProductFragment extends AppBaseFragment {


    public static ProductFragment getInstance(){
        return new ProductFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_product_fragment;
    }
}
