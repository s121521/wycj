package com.wxdc.nmgyt.nmgytwydc.activity;

import android.annotation.SuppressLint;

import com.wxdc.nmgyt.nmgytwydc.agentweb.base.BaseWebActivity;

/**
 * Created by Administrator on 2018/3/19.
 * Activity 使用 AgentWeb
 * 1.Activity 继承BaseWebActivity
 * 2.重写getUrl()方法
 */

@SuppressLint("Registered")
public class WebActivity extends BaseWebActivity {
    @Override
    public String getUrl() {
        return "http://www.baidu.com";
    }
}
