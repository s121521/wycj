package com.wxdc.nmgyt.nmgytwydc.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018/3/21.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int getLayout();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
//        toolbar.setTitleTextColor(Color.WHITE);
//        toolbar.setTitle("");
//        toolbarTitle.setText("外业采集");
//        this.setSupportActionBar(toolbar);
//        this.setSupportActionBar(toolbar);
//        if (getSupportActionBar() != null) {
//            // Enable the Up button
//            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
//        }
    }
}
