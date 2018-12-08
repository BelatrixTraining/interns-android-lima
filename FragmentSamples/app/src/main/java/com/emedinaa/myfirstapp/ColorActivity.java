package com.emedinaa.myfirstapp;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.emedinaa.myfirstapp.ui.events.OnColorListener;
import com.emedinaa.myfirstapp.ui.fragments.BottomBarFragment;
import com.emedinaa.myfirstapp.ui.fragments.BoxFragment;


public class ColorActivity extends AppCompatActivity implements OnColorListener {

    private BottomBarFragment bottomBarFragment;
    private BoxFragment boxFragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        fragmentManager= getSupportFragmentManager();

        bottomBarFragment= (BottomBarFragment) fragmentManager.findFragmentById(R.id.fragBottom);
        boxFragment= (BoxFragment) fragmentManager.findFragmentById(R.id.fragBox);
    }

}
