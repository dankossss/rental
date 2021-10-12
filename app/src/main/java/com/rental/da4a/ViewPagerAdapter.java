package com.rental.da4a;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final String[] tabs;


    public ViewPagerAdapter(@NonNull @NotNull FragmentManager fm, String[] tabs) {
        super(fm);
        this.tabs = tabs;
    }

    @NotNull
    @Override
    public Fragment getItem(int position) {
        return position == 0 ? new LoginFragment() : new RegistrationFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length ;
    }
}
