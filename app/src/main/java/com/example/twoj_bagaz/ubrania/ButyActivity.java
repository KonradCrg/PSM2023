package com.example.twoj_bagaz.ubrania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoj_bagaz.R;
import com.example.twoj_bagaz.WybraneUbranieActivity;

public class ButyActivity extends AppCompatActivity {

    private Button button_zimowe;
    private Button button_letnie;
    private Button button_plazowe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buty);

        button_letnie = findViewById(R.id.buty_letnie);
        button_zimowe = findViewById(R.id.buty_zimowe);
        button_plazowe = findViewById(R.id.buty_plazowe);

        button_letnie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_letnie.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ButyActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });

        button_zimowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_plazowe.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ButyActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_plazowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_plazowe.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ButyActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
    }
}