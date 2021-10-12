package com.rental.da4a.bottomNavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.rental.da4a.R;

public class FragmentFavorites extends Fragment {

    public FragmentFavorites() {
        super(R.layout.favorites);
    }

    public static Fragment newInstance() {
        return new FragmentFavorites();
    }

    public View onViewCreated(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.favorites, container, false);
    }
}