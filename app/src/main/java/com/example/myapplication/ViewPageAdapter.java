package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentsList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();

    public ViewPageAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        return fragmentsList.get(position);
    }

    @Override
    public int getCount(){
        return FragmentListTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return FragmentListTitles.get(position);
    }

    public void AddFragments(Fragment fragment, String Tittle){
        fragmentsList.add(fragment);
        FragmentListTitles.add(Tittle);
    }
}
