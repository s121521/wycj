package com.wxdc.nmgyt.nmgytwydc.customEnum;

import android.support.v4.app.Fragment;

import com.wxdc.nmgyt.nmgytwydc.R;
import com.wxdc.nmgyt.nmgytwydc.fragment.NavigationDataFragment;
import com.wxdc.nmgyt.nmgytwydc.fragment.NavigationHomeFragment;
import com.wxdc.nmgyt.nmgytwydc.fragment.NavigationMeFragment;

/**
 * Created by Administrator on 2018/3/21.
 */

public enum TabFragment {
    navigation1(NavigationHomeFragment.class, R.id.navigation_index1),
    navigation2(NavigationDataFragment.class,R.id.navigation_index2),
    navigation3(NavigationMeFragment.class,R.id.navigation_index3);

    private final Class<?extends Fragment> childFragment;
    private final int menuID;
    private Fragment mFragment;

    TabFragment(Class<? extends Fragment> childFragment, int menuID) {
        this.childFragment = childFragment;
        this.menuID = menuID;
    }
    public Fragment fragment(){
        if (mFragment == null) {
            try {
                mFragment = childFragment.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                mFragment = new Fragment();
            }
        }
        return mFragment;
    }

    public static TabFragment from(int itemID){
        for (TabFragment fragment:values()) {
            if (fragment.menuID == itemID) {
                return fragment;
            }
        }
        return navigation1;
    }

    public static void onDestroy(){
        for (TabFragment fragment : values()) {
            fragment.mFragment = null;
        }
    }
}
