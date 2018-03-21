package com.wxdc.nmgyt.nmgytwydc.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.wxdc.nmgyt.nmgytwydc.R;

/**
 * Created by Administrator on 2018/3/19.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected  abstract Fragment createFragment();
    protected abstract int getLayout();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.map_container);
//        if (fragment == null) {
//            fragment = createFragment();
//            fm.beginTransaction().add(R.id.map_container,fragment).commit();
//        }
    }
}
