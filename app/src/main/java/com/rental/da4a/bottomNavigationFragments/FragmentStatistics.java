package com.rental.da4a.bottomNavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.rental.da4a.R;

public class FragmentStatistics extends Fragment {

    public FragmentStatistics() {
        super(R.layout.statistics);
    }

    public static Fragment newInstance() {
        return new FragmentStatistics();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.statistics, container, false);
    }
}