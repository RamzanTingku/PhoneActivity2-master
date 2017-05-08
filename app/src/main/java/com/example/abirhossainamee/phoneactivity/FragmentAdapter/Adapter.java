package com.example.abirhossainamee.phoneactivity.FragmentAdapter;

/**
 * Created by abirhossainamee on 5/6/17.
 */


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends FragmentPagerAdapter {

    public List<Fragment> mFragmentList = new ArrayList<>();
    public List<String> mTabsTitleList = new ArrayList<>();

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void add(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mTabsTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabsTitleList.get(position);
    }
}
