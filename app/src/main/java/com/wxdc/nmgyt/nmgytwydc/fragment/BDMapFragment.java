package com.wxdc.nmgyt.nmgytwydc.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wxdc.nmgyt.nmgytwydc.R;

/**
 * Created by Administrator on 2018/3/20.
 */

public class BDMapFragment extends Fragment {

    public final String TAG = this.getClass().getSimpleName();
    public static final String TAG_URL = "tag_url";
    public static BDMapFragment newInstance(Bundle bundle) {
        BDMapFragment bdMapFragment = new BDMapFragment();
        if (bundle != null) {
            bdMapFragment.setArguments(bundle);
        }
        return bdMapFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String url = getArguments().getString(TAG_URL);
        Log.i(TAG, "onCreate:---------url: "+url);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bdmap, container, false);

        return view;
    }
}
