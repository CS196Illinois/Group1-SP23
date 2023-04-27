package com.example.cs124loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginButton;

    String correctUsername = "admin";
    String correctPassword = "Password123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(v -> {
            if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                Toast.makeText(MainActivity.this, "Empty data provided", Toast.LENGTH_LONG).show();
            } else if (username.getText().toString().equals(correctUsername)) {
                if (password.getText().toString().equals(correctPassword)) {
                    Toast.makeText(MainActivity.this, "Successful login", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Incorrect password", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "Invalid Username/Password Try again", Toast.LENGTH_LONG).show();
            }
        });
    }
}