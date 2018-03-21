package com.wxdc.nmgyt.nmgytwydc.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.wxdc.nmgyt.nmgytwydc.R;
import com.wxdc.nmgyt.nmgytwydc.adapter.ViewPagerAdapter;
import com.wxdc.nmgyt.nmgytwydc.customEnum.TabFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements OnNavigationItemSelectedListener,OnPageChangeListener {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView mBottomNavigation;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    MenuItem prevMenuItem;
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        mBottomNavigation.setOnNavigationItemSelectedListener(this);
        mBottomNavigation.setSelectedItemId(R.id.navigation_index1);
        mViewpager.addOnPageChangeListener(this);
        setViewpager();
    }

    /*
    底部菜单事件
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_index1:
                //showMessage("首页");
                mViewpager.setCurrentItem(0);
                break;
            case R.id.navigation_index2:
                //showMessage("数据");
                mViewpager.setCurrentItem(1);
                break;
            case R.id.navigation_index3:
                //showMessage("我");
                mViewpager.setCurrentItem(2);
                break;
            default:
                break;
        }
        return false;
    }
    /*
    * 实现OnPageChangeListener接口方法
    * */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (prevMenuItem != null) {
            prevMenuItem.setChecked(false);
        } else {
            mBottomNavigation.getMenu().getItem(0).setChecked(false);
        }

        mBottomNavigation.getMenu().getItem(position).setChecked(true);
        prevMenuItem = mBottomNavigation.getMenu().getItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
    /*
    * 设置ViewPager*/
    private void setViewpager(){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager()) ;
        adapter.addFragment(TabFragment.from(R.id.navigation_index1).fragment());
        adapter.addFragment(TabFragment.from(R.id.navigation_index2).fragment());
        adapter.addFragment(TabFragment.from(R.id.navigation_index3).fragment());
        mViewpager.setAdapter(adapter);
    }
    /*
    * activity 生命周期
    * */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TabFragment.onDestroy();
    }

    /*
        * 消息提示
        * */
    private void showMessage(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
