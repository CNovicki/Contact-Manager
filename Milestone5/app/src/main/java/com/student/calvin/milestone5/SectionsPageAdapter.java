package com.student.calvin.milestone5;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> M_FRAGMENT_LIST = new ArrayList<>();

    private final List<String> M_FRAGMENT_TITLE_LIST = new ArrayList<>();

    public SectionsPageAdapter(FragmentManager fm) {

        super(fm);

    }

    public void addFragment(Fragment fragment, String title) {

        M_FRAGMENT_LIST.add(fragment);

        M_FRAGMENT_TITLE_LIST.add(title);

    }

    @Override
    public CharSequence getPageTitle(int position) {

        return M_FRAGMENT_TITLE_LIST.get(position);

    }

    @Override
    public Fragment getItem(int position) {

        return M_FRAGMENT_LIST.get(position);

    }

    @Override
    public int getCount() {

        return M_FRAGMENT_LIST.size();

    }

}
