package com.beijing.fun.activity.game;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.beijing.fun.BaseActivity;
import com.beijing.fun.R;
import com.beijing.fun.adapter.game.GameDetailPagerAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * @author mengxiangcheng
 * @date 16/9/20 下午5:51
 * @copyright ©2016 孟祥程 All Rights Reserved
 * @desc
 */
@EActivity(R.layout.ac_gamedetail)
public class GameDetailActivity extends BaseActivity {

    @ViewById
    TabLayout tl_game;

    FragmentPagerAdapter pagerAdapter;

    @ViewById
    ViewPager viewpager;

    @AfterViews
    void afterView(){
        pagerAdapter = new GameDetailPagerAdapter(getSupportFragmentManager(),"id");
        viewpager.setAdapter(pagerAdapter);
        viewpager.setOffscreenPageLimit(3);
        tl_game.setupWithViewPager(viewpager);
    }

}
