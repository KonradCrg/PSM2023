package com.example.twoj_bagaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogowanieActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logowanie);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(LogowanieActivity.this, "Udalo sie zalogowac", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LogowanieActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText( LogowanieActivity.this, "Nie udalo sie zalogowac", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}