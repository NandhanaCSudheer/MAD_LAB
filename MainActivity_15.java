package com.example.layout_linear;

import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_15 extends AppCompatActivity {

    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create LinearLayout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(50, 50, 50, 50);

        // Email EditText
        email = new EditText(this);
        email.setHint("Enter Email");

        // Password EditText
        password = new EditText(this);
        password.setHint("Enter Password");
        password.setInputType(InputType.TYPE_CLASS_TEXT |
                InputType.TYPE_TEXT_VARIATION_PASSWORD);

        // Login Button
        login = new Button(this);
        login.setText("Login");

        // Add views to layout
        layout.addView(email);
        layout.addView(password);
        layout.addView(login);

        // Display layout
        setContentView(layout);

        // Button click event
        login.setOnClickListener(v -> {
            String mail = email.getText().toString();
            String pass = password.getText().toString();

            Toast.makeText(
                    MainActivity_15.this,
                    "Email: " + mail + "\nPassword: " + pass,
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}