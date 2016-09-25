package com.beijing.fun.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beijing.fun.R;

/**
 * Created by qiuzhenhuan on 16/9/25.
 */
public class MyFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_my,null);
    }


    public static MyFragment getInstance(){
        MyFragment myFragment = new MyFragment();
        return myFragment;
    }
}
