package com.example.select_from_spinner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_13 extends AppCompatActivity {

    EditText username, password;
    Button loginButton;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sp = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        // Check previous login
        if (sp.getBoolean("logged_in", false)) {

            Intent intent = new Intent(MainActivity_13.this, Dashboard.class);
            startActivity(intent);
            finish();
            return;
        }


        setContentView(R.layout.activity_main13);


        username = findViewById(R.id.editTextText);
        password = findViewById(R.id.editTextTextPassword);
        loginButton = findViewById(R.id.button2);


        loginButton.setOnClickListener(v -> {

            String name = username.getText().toString();
            String pass = password.getText().toString();


            if(name.isEmpty() || pass.isEmpty()) {

                Toast.makeText(this,
                        "Enter username and password",
                        Toast.LENGTH_SHORT).show();

            }
            else {

                // Save login details
                SharedPreferences.Editor editor = sp.edit();

                editor.putString("username", name);
                editor.putBoolean("logged_in", true);

                editor.apply();


                // Move to Dashboard
                Intent intent = new Intent(MainActivity_13.this,
                        Dashboard.class);

                startActivity(intent);
                finish();
            }

        });

    }
}