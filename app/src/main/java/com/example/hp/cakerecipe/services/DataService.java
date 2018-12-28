package com.example.hp.cakerecipe.services;

import com.example.hp.cakerecipe.model.Cakes;

import java.util.ArrayList;

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Cakes> getTypeOneCakes(){

        ArrayList<Cakes> list = new ArrayList<>();
        list.add(new Cakes("Cake 1","cake1"));
        list.add(new Cakes("Cake 2","cake2"));
        list.add(new Cakes("Cake 3","cake3"));

        return list;
    }

    public ArrayList<Cakes> getTypeTwoCakes(){

        ArrayList<Cakes> list = new ArrayList<>();
        list.add(new Cakes("Cake 1","cake1"));
        list.add(new Cakes("Cake 2","cake2"));
        list.add(new Cakes("Cake 3","cake3"));

        return list;
    }

    public ArrayList<Cakes> getTypeThreeCakes(){

        ArrayList<Cakes> list = new ArrayList<>();
        list.add(new Cakes("Cake 1","cake1"));
        list.add(new Cakes("Cake 2","cake2"));
        list.add(new Cakes("Cake 3","cake3"));

        return list;
    }
}
