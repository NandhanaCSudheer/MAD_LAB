package com.example.mypopupmenu;


import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity21 extends AppCompatActivity {


    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);



        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                // Create Popup Menu
                PopupMenu popupMenu =
                        new PopupMenu(MainActivity21.this, button);



                // Load menu items
                popupMenu.getMenuInflater()
                        .inflate(R.menu.popupmenu,
                                popupMenu.getMenu());



                // Item click listener
                popupMenu.setOnMenuItemClickListener(
                        new PopupMenu.OnMenuItemClickListener() {

                            @Override
                            public boolean onMenuItemClick(MenuItem item) {


                                if(item.getItemId() == R.id.item1)
                                {

                                    textView.setText(
                                            "Hi, Iam Nandhana"
                                    );

                                }


                                else if(item.getItemId() == R.id.item2)
                                {

                                    textView.setText(
                                            "Second item clicked"
                                    );

                                }


                                else if(item.getItemId() == R.id.item3)
                                {

                                    textView.setText(
                                            "Third item clicked"
                                    );

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