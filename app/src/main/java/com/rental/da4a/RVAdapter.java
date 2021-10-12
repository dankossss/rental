package com.rental.da4a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.LotViewHolder> {

    List<Lot> lots;

    public RVAdapter(List<Lot> lots) {
        this.lots = lots;
    }

    @NonNull
    @NotNull
    @Override
    public LotViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        LotViewHolder lotViewHolder = new LotViewHolder(v);
        return lotViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull LotViewHolder holder, int position) {
        holder.name.setText(lots.get(position).getName());
        holder.price.setText(lots.get(position).getPrice());
        holder.description.setText(lots.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return lots.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class LotViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;
        TextView name;
        TextView price;
        TextView description;

        public LotViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView)itemView.findViewById(R.id.recyclerView);
            name = (TextView)itemView.findViewById(R.id.name);
            price = (TextView)itemView.findViewById(R.id.price);
            description = (TextView)itemView.findViewById(R.id.description);
        }
    }
}
