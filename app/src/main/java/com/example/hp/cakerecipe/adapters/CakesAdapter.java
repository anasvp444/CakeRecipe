package com.example.hp.cakerecipe.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.cakerecipe.R;
import com.example.hp.cakerecipe.holders.CakeHolder;
import com.example.hp.cakerecipe.model.Cakes;

import java.util.ArrayList;

public class CakesAdapter extends RecyclerView.Adapter<CakeHolder> {

    private ArrayList<Cakes> cakes;

    public CakesAdapter(ArrayList<Cakes> cakes) {
        this.cakes = cakes;
    }

    @Override
    public int getItemCount() {
        return cakes.size();
    }

    @NonNull
    @Override
    public CakeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View cardCake = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cake_card,viewGroup,false);

        return new CakeHolder(cardCake);
    }

    @Override
    public void onBindViewHolder(@NonNull CakeHolder cakeHolder, int i) {
        Cakes cake = cakes.get(i);
        cakeHolder.updateUi(cake);
    }
}
