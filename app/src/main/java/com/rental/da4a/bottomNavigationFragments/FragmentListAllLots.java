package com.rental.da4a.bottomNavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.rental.da4a.Lot;
import com.rental.da4a.R;
import com.rental.da4a.RVAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentListAllLots extends Fragment {

    public FragmentListAllLots() {
        super(R.layout.list_all_lots);
    }

    public static Fragment newInstance() {
        return new FragmentListAllLots();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list_all_lots, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RVAdapter adapter = new RVAdapter(getLots());
        recyclerView.setAdapter(adapter);
        return view;
    }

    public List<Lot> getLots() {
        List<Lot> lots = new ArrayList<>();
        lots.add(new Lot("Сукня", "3000", "дитячий одяг"));
        lots.add(new Lot("Пилосос", "5000", "прибирання"));
        lots.add(new Lot("Перфоратор", "4000", "ремонт"));
        lots.add(new Lot("Фотоапарат", "6000", "техніка"));
        lots.add(new Lot("Сукня", "300", "дитячий одяг"));
        lots.add(new Lot("Пилосос", "500", "прибирання"));
        lots.add(new Lot("Перфоратор", "400", "ремонт"));
        lots.add(new Lot("Фотоапарат", "600", "техніка"));
        lots.add(new Lot("Сукня", "300", "дитячий одяг"));
        lots.add(new Lot("Пилосос", "500", "прибирання"));
        lots.add(new Lot("Перфоратор", "400", "ремонт"));
        lots.add(new Lot("Фотоапарат", "600", "техніка"));
        lots.add(new Lot("Сукня", "300", "дитячий одяг"));
        lots.add(new Lot("Пилосос", "500", "прибирання"));
        lots.add(new Lot("Перфоратор", "400", "ремонт"));
        lots.add(new Lot("Фотоапарат", "600", "техніка"));
        lots.add(new Lot("Сукня", "300", "дитячий одяг"));
        lots.add(new Lot("Пилосос", "500", "прибирання"));
        lots.add(new Lot("Перфоратор", "400", "ремонт"));
        lots.add(new Lot("Фотоапарат", "600", "техніка"));
        lots.add(new Lot("Сукня", "300", "дитячий одяг"));
        lots.add(new Lot("Пилосос", "500", "прибирання"));
        lots.add(new Lot("Перфоратор", "400", "ремонт"));
        lots.add(new Lot("Фотоапарат", "600", "техніка"));
        return lots;
    }

}
