package com.harry;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Setttings pressed", Toast.LENGTH_SHORT).show();
            return true;
        }
//        } else if (id == R.id.test) {
//            Toast.makeText(this, "Test pressed", Toast.LENGTH_SHORT).show();
//            return true;
//        }

        //if we dont handle any icon or menu then os will handle it
        Toast.makeText(this, "test pressed", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
