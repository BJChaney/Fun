package com.beijing.fun.adapter.game;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author mengxiangcheng
 * @date 16/9/20 下午5:47
 * @copyright ©2016 孟祥程 All Rights Reserved
 * @desc 赛事详情viewpager adapter
 */
public class GameDetailPagerAdapter extends FragmentPagerAdapter {
    private String gameId = "";
    private String[] tabTitles = new String[]{"赛况","集锦","详情"};
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
    public GameDetailPagerAdapter(FragmentManager fm, String gameId) {
        super(fm);
        this.gameId = gameId;
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
//                return ExpertInfoFragment.newInstance(userId);
            case 1:
//                return ExpertTopicFragment.newInstance(userId);
            case 2:
//                RankEntity entity = new RankEntity();
//                entity.setId(userId);
//                return ExpertYiDaFragment.newInstance(entity);
        }
        return null;
    }
}