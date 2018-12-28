package com.example.hp.cakerecipe.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.cakerecipe.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        CakesFragment cakesTopFragment;
        CakesFragment cakesMiddileFragment;
        CakesFragment cakesBottomFragment;

        cakesTopFragment = CakesFragment.newInstance(CakesFragment.CAKE_TYPE_0);
        fragmentManager.beginTransaction().add(R.id.containerTopRow,cakesTopFragment).commit();

        cakesMiddileFragment = CakesFragment.newInstance(CakesFragment.CAKE_TYPE_1);
        fragmentManager.beginTransaction().add(R.id.containerMiddleRow,cakesMiddileFragment).commit();

        cakesBottomFragment = CakesFragment.newInstance(CakesFragment.CAKE_TYPE_2);
        fragmentManager.beginTransaction().add(R.id.containerBottomRow,cakesBottomFragment).commit();

        return view;
    }

}
