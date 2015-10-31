package com.mobile.zjuroszek.cv.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zjuroszek.cv.R;

import butterknife.ButterKnife;

/**
 * Created by zjuroszek on 17.10.15.
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = initView(inflater,container,savedInstanceState);
        return root;
    }
    public abstract ViewGroup initView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState);
}
