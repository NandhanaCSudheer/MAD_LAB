package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Appstate","created");

    }
//onPause,onStop,onDestroy,onRestart,onStart,onResume,onCreate
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Appstate","started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Appstate","resuming");

    }
}