package com.example.administrator.hzsb_office_master.fragmet;
import com.example.administrator.hzsb_office_master.R;
import com.example.administrator.hzsb_office_master.base.AppBaseFragment;


/**
 * Created by liujiancheng  on 2017/4/14.
 */

public class Inventoryfragment  extends AppBaseFragment{


    private final String TAG = Inventoryfragment.class.getSimpleName();
    private static Inventoryfragment mInventoryfragment;

    public static Inventoryfragment getInstance(){
        if(mInventoryfragment == null){
            return  mInventoryfragment = new Inventoryfragment();
        }
        return mInventoryfragment;

    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_inventory_activity;
    }

    
}
