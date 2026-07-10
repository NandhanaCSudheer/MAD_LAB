package com.example.shared_p;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shared_p.R;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView t1=(TextView) findViewById(R.id.textview);
        Button write=(Button) findViewById(R.id.button);
        Button read=(Button) findViewById(R.id.button2);
        String userdemo,email;
        userdemo="maji";
        email="maji@gmail.com";
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences shrp = getSharedPreferences("SharedPreference_Name",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrp.edit();
                editor.putString("Username",userdemo);
                editor.putString("Email",email);
                editor.commit();
                t1.setText("Write operation successful");
            }
        });
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences shrp = getSharedPreferences("SharedPreference_Name",MODE_PRIVATE);
                String s1,s2;
                s1=shrp.getString("Username","");
                s2=shrp.getString("Email","");
                t1.setText("USERNAME : "+s1+"\n EMAIL : "+s2);

            }
        });

    }
}