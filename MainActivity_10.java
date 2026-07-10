package com.example.my_intentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_10 extends AppCompatActivity {

    Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = findViewById(R.id.button);

        btnOpen.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity_10.this);

            builder.setTitle("Exit");
            builder.setMessage("Do you want to exit the app?");

            builder.setPositiveButton("Yes", (dialog, which) -> {
                // Open Google
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com"));
                startActivity(intent);

                // Close the app
                finish();
            });

            builder.setNegativeButton("No", (dialog, which) -> {
                dialog.dismiss();
            });

            builder.show();
        });
    }
}