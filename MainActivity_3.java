package com.example.myappli;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etn, eta, ete, etp;
    Button b, r;
    RadioGroup rg;
    CheckBox c1, c2, c3, c4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etn = findViewById(R.id.editTextText2);
        eta = findViewById(R.id.editTextText3);
        ete = findViewById(R.id.editTextTextEmailAddress);
        etp = findViewById(R.id.editTextNumberPassword);

        b = findViewById(R.id.button);     // Submit
        r = findViewById(R.id.button2);    // Reset

        rg = findViewById(R.id.radioGroup);

        c1 = findViewById(R.id.checkBox5);
        c2 = findViewById(R.id.checkBox6);
        c3 = findViewById(R.id.checkBox7);
        c4 = findViewById(R.id.checkBox8);

        // Submit Button
        b.setOnClickListener(v -> {

            String name = etn.getText().toString().trim();
            String age = eta.getText().toString().trim();
            String email = ete.getText().toString().trim();
            String password = etp.getText().toString().trim();

            int id = rg.getCheckedRadioButtonId();

            if (id == -1) {
                Toast.makeText(MainActivity.this,
                        "Please select a gender",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton rb = findViewById(id);
            String gender = rb.getText().toString();

            String qualification = "";

            if (c1.isChecked())
                qualification += "SSLC ";

            if (c2.isChecked())
                qualification += "Degree ";

            if (c3.isChecked())
                qualification += "Diploma ";

            if (c4.isChecked())
                qualification += "Plus Two ";

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            intent.putExtra("name", name);
            intent.putExtra("age", age);
            intent.putExtra("email", email);
            intent.putExtra("password", password);
            intent.putExtra("gender", gender);
            intent.putExtra("qualification", qualification);

            startActivity(intent);
        });

        // Reset Button
        r.setOnClickListener(v -> {

            etn.setText("");
            eta.setText("");
            ete.setText("");
            etp.setText("");

            rg.clearCheck();

            c1.setChecked(false);
            c2.setChecked(false);
            c3.setChecked(false);
            c4.setChecked(false);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top,
                    systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}