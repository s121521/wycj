package com.wxdc.nmgyt.nmgytwydc.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wxdc.nmgyt.nmgytwydc.R;

/**
 * Created by Administrator on 2018/3/20.
 */

public class ArgisMapFragment extends Fragment {

    public static final String TAG_URL = "tag_url";
    private final String  TAG = this.getClass().getSimpleName();
    public static ArgisMapFragment newInstance(Bundle bundle) {
        ArgisMapFragment fragment = new ArgisMapFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: ------url:"+TAG_URL);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_arcgismap, container, false);
        return view;
    }
}
