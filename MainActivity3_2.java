package com.example.myappli;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        tv = findViewById(R.id.textView3);

        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");
        String gender = getIntent().getStringExtra("gender");
        String qualification = getIntent().getStringExtra("qualification");

        String details =
                "Registration Details\n\n" +
                        "Name : " + name +
                        "\nAge : " + age +
                        "\nEmail : " + email +
                        "\nPassword : " + password +
                        "\nGender : " + gender +
                        "\nQualification : " + qualification;

        tv.setText(details);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top,
                    systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}