package com.example.my_popupmenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity20 extends AppCompatActivity {


    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                // Create Popup Menu
                PopupMenu popupMenu =
                        new PopupMenu(MainActivity20.this, button);


                // Inflate popupmenu.xml
                popupMenu.getMenuInflater()
                        .inflate(R.menu.popupmenu, popupMenu.getMenu());



                // Handle menu item clicks
                popupMenu.setOnMenuItemClickListener(
                        new PopupMenu.OnMenuItemClickListener() {

                            @Override
                            public boolean onMenuItemClick(MenuItem item) {


                                int id = item.getItemId();


                                if(id == R.id.item1)
                                {
                                    Toast.makeText(
                                            MainActivity20.this,
                                            "Add clicked",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }


                                else if(id == R.id.item2)
                                {
                                    Toast.makeText(
                                            MainActivity20.this,
                                            "Delete clicked",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }


                                else if(id == R.id.item3)
                                {
                                    Toast.makeText(
                                            MainActivity20.this,
                                            "Submit clicked",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }


                                else if(id == R.id.item4)
                                {
                                    Toast.makeText(
                                            MainActivity20.this,
                                            "Reset clicked",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }


                                else if(id == R.id.item5)
                                {
                                    finish();
                                }


                                return true;
                            }

                        });



                // Show Popup Menu
                popupMenu.show();

            }
        });

    }
}