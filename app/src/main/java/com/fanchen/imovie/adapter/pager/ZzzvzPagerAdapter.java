package com.fanchen.imovie.adapter.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.fanchen.imovie.base.BaseFragmentAdapter;
import com.fanchen.imovie.fragment.VideoListFragment;
import com.fanchen.imovie.retrofit.service.ZzzvzService;

/**
 * ZzzvzPagerAdapter
 * Created by fanchen on 2018/7/27.
 */
public class ZzzvzPagerAdapter extends BaseFragmentAdapter {
    private final String[] TITLES = new String[]{"首页","电视剧", "电影", "动漫","综艺"};
    private final String[] PATHS = new String[]{"","dsj", "dy", "Animation","Arts"};
    private final Boolean[] LOADS = new Boolean[]{false,false,false,true,true,true};
    private final Boolean[] BANGUMI = new Boolean[]{true,false,false,true,false,false};

    public ZzzvzPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public String[] getTitles() {
        return TITLES;
    }

    @Override
    public Fragment createFragment(int position) {
        return VideoListFragment.newInstance(PATHS[position], getExtendInfo().toString(), 1, LOADS[position], false, false, null, BANGUMI[position]);
    }

    @Override
    public Object getExtendInfo() {
        return ZzzvzService.class.getName();
    }
}
