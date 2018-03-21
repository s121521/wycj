package com.wxdc.nmgyt.nmgytwydc.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private FragmentManager mFragmentManager;
    private final List<Fragment> mFragments = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        mFragmentManager = fm;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Fragment instantiateItem(ViewGroup container, int position) {
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        mFragmentManager.beginTransaction().show(fragment).commit();
        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        Fragment fragment = mFragments.get(position);
        mFragmentManager.beginTransaction().hide(fragment).commit();
    }

    public void addFragment(Fragment fragment){
        mFragments.add(fragment);
    }
}
