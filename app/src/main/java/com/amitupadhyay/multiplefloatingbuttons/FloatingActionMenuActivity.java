package com.amitupadhyay.multiplefloatingbuttons;

import android.os.Bundle;

import carbon.widget.FloatingActionButton;

public class FloatingActionMenuActivity extends SamplesActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_menu);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setMenu(R.menu.menu_fab);
    }
}