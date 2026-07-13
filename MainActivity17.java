package com.example.my_menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity17 extends AppCompatActivity {

    Toolbar tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tool = findViewById(R.id.toolbar2);

        // Set Toolbar as ActionBar
        setSupportActionBar(tool);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("My Menu");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.item2) {
            Toast.makeText(this, "Apple", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.item3) {
            Toast.makeText(this, "Mango", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.item4) {
            Toast.makeText(this, "Watermelon", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}