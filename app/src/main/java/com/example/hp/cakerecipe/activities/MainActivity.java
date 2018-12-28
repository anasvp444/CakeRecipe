package com.example.hp.cakerecipe.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.hp.cakerecipe.R;
import com.example.hp.cakerecipe.fragments.DetailFragment;
import com.example.hp.cakerecipe.fragments.MainFragment;
import com.example.hp.cakerecipe.model.Cakes;

public class MainActivity extends AppCompatActivity {


    private static MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.setMainActivity(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fragmentManager.findFragmentById(R.id.container_main);

        if(mainFragment == null){
            mainFragment = MainFragment.newInstance();
            fragmentManager.beginTransaction().add(R.id.container_main,mainFragment).commit();
        }
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    public void loadDetailScreen(){


        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new DetailFragment()).addToBackStack(null).commit();
    }

}
