package com.example.kashyap.testproject;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new ItemFragment()).commit();


    }

    @Override
    public void onListFragmentInteraction(NewsFeed item) {

    }
}
