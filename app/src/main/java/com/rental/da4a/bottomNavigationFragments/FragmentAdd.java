package com.rental.da4a.bottomNavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.rental.da4a.R;

public class FragmentAdd extends Fragment {

    public FragmentAdd() {
        super(R.layout.add_lot);
    }

    public static Fragment newInstance() {
        return new FragmentAdd();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.add_lot, container, false);
    }
}