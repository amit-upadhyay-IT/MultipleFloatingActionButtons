package com.amitupadhyay.multiplefloatingbuttons;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import carbon.widget.FloatingActionButton;

public class FloatingActionMenuActivity extends SamplesActivity implements MenuItem.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_menu);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setMenu(R.menu.menu_fab);

        fab.setOnMenuItemClickListener(this);

    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_fab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.fender:
                Toast.makeText(this, "Fender", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.schecter:
                Toast.makeText(this, "Schecter", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.gibson:
                Toast.makeText(this, "Gibson", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.hagstrom:
                Toast.makeText(this, "Hagstrom", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ibanez:
                Toast.makeText(this, "Ibanez", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.fender:
                Toast.makeText(this, "Fender", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.schecter:
                Toast.makeText(this, "Schecter", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.gibson:
                Toast.makeText(this, "Gibson", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.hagstrom:
                Toast.makeText(this, "Hagstrom", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ibanez:
                Toast.makeText(this, "Ibanez", Toast.LENGTH_SHORT).show();
                return true;
            /*default:
                return super.onOptionsItemSelected(menuItem);*/
        }
        return false;
    }
}
