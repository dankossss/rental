package com.rental.da4a.bottomNavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.rental.da4a.R;
import com.rental.da4a.ViewPagerAdapter;

public class FragmentProfile extends Fragment {

    private static Fragment fragmentProfile;


    public FragmentProfile() {
        super(R.layout.profile);
    }

    public static Fragment newInstance() {
        fragmentProfile = fragmentProfile == null ? new FragmentProfile() : fragmentProfile;
        return fragmentProfile;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile, container, false);

        ViewPager viewPager = view.findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager(), new String[] {"Авторизація", "Реєстрація"});
        viewPager.setAdapter(adapter);

        TabLayout tabs = view.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        return view;
    }



}
