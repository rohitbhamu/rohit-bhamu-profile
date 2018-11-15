package com.example.rohitkumarbhamu.rohitbhamu.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.rohitkumarbhamu.rohitbhamu.views.AboutFragment;
import com.example.rohitkumarbhamu.rohitbhamu.views.ContactFragment;
import com.example.rohitkumarbhamu.rohitbhamu.views.SkillsFragment;
import com.example.rohitkumarbhamu.rohitbhamu.views.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }
        return null;
    }
    @Override
    public int getCount(){
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "ABOUT";
            case 1: return "WORK";
            case 2: return "SKILL";
            case 3:return "CONTACT";
        }
        return super.getPageTitle(position);
    }
}

