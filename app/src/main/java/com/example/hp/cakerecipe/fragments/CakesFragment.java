package com.example.hp.cakerecipe.fragments;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.cakerecipe.R;
import com.example.hp.cakerecipe.adapters.CakesAdapter;
import com.example.hp.cakerecipe.services.DataService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CakesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CakesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_CAKES_TYPE = "cakeType";




    public static final int CAKE_TYPE_0 = 0;
    public static final int CAKE_TYPE_1 = 1;
    public static final int CAKE_TYPE_2 = 2;

    private static int cakeType;

    public CakesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param cakeType Cake Type.
     * @return A new instance of fragment CakesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CakesFragment newInstance(int cakeType) {
        CakesFragment fragment = new CakesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_CAKES_TYPE, cakeType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
                cakeType = getArguments().getInt(ARG_CAKES_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cakes, container, false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recyclerCakes);
        recyclerView.setHasFixedSize(true);

        CakesAdapter cakesAdapter;
        if(cakeType == CAKE_TYPE_0){
            cakesAdapter = new CakesAdapter(DataService.getInstance().getTypeOneCakes());
        }else if(cakeType == CAKE_TYPE_1){
            cakesAdapter = new CakesAdapter(DataService.getInstance().getTypeTwoCakes());
        }else{
            cakesAdapter = new CakesAdapter(DataService.getInstance().getTypeThreeCakes());
        }

        recyclerView.addItemDecoration(new HorizontalSpaceDecorator(30));
        recyclerView.setAdapter(cakesAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        return view;
    }

}

class HorizontalSpaceDecorator extends RecyclerView.ItemDecoration{
    private final int spacer;

    public HorizontalSpaceDecorator(int spacer) {
        this.spacer = spacer;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        outRect.right = spacer;
    }
}