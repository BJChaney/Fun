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
        View view = inflater.inflate(R.layout.fg_my,null);
        findViews(view);
        return view;
    }

    private void findViews(View view) {


        view.findViewById(R.id.iv_avator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goUserInfoActivity();
            }
        });
    }

    private void goUserInfoActivity() {

    }


    public static MyFragment getInstance(){
        MyFragment myFragment = new MyFragment();
        return myFragment;
    }
}
