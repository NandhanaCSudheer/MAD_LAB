package com.example.my_contextadapter;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity19 extends AppCompatActivity {

    ListView listView;

    ArrayList<String> fruits;

    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);


        // Create ArrayList
        fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Pineapple");


        // Create Adapter
        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                fruits
        );


        // Set adapter
        listView.setAdapter(adapter);


        // Enable Context Menu
        registerForContextMenu(listView);

    }



    // Create Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu,
                                    View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);


        menu.setHeaderTitle("Select Action");


        menu.add(0,1,0,"Edit");
        menu.add(0,2,1,"Delete");
        menu.add(0,3,2,"Share");
        menu.add(0,4,3,"Copy");

    }



    // Handle Context Menu Click
    @Override
    public boolean onContextItemSelected(MenuItem item) {


        AdapterView.AdapterContextMenuInfo info =
                (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();


        // Get selected position
        int position = info.position;


        // Get selected item
        String selectedFruit = fruits.get(position);



        switch(item.getItemId()) {


            case 1:

                Toast.makeText(
                        this,
                        "Edit " + selectedFruit,
                        Toast.LENGTH_SHORT
                ).show();

                break;



            case 2:

                // Remove item from ArrayList
                fruits.remove(position);


                // Refresh ListView
                adapter.notifyDataSetChanged();


                Toast.makeText(
                        this,
                        selectedFruit + " deleted",
                        Toast.LENGTH_SHORT
                ).show();

                break;



            case 3:

                Toast.makeText(
                        this,
                        "Share " + selectedFruit,
                        Toast.LENGTH_SHORT
                ).show();

                break;



            case 4:

                Toast.makeText(
                        this,
                        "Copy " + selectedFruit,
                        Toast.LENGTH_SHORT
                ).show();

                break;
        }


        return true;
    }
}