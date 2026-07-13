package com.example.my_contextmenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity18 extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);


        // Register views for Context Menu
        registerForContextMenu(textView);
        registerForContextMenu(textView2);
        registerForContextMenu(textView3);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main),
                (v, insets) -> {

                    Insets systemBars =
                            insets.getInsets(WindowInsetsCompat.Type.systemBars());

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                });
    }


    // Create Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu,
                                    View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);


        menu.setHeaderTitle("Select Option");


        menu.add(0, 1, 0, "Edit");
        menu.add(0, 2, 1, "Delete");
        menu.add(0, 3, 2, "Share");
        menu.add(0, 4, 3, "Copy");
    }


    // Handle Context Menu Click
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch(item.getItemId()) {

            case 1:
                Toast.makeText(this,
                        "Edit clicked",
                        Toast.LENGTH_SHORT).show();
                break;


            case 2:
                Toast.makeText(this,
                        "Delete clicked",
                        Toast.LENGTH_SHORT).show();
                break;


            case 3:
                Toast.makeText(this,
                        "Share clicked",
                        Toast.LENGTH_SHORT).show();
                break;


            case 4:
                Toast.makeText(this,
                        "Copy clicked",
                        Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}