package com.example.twoj_bagaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ApteczkaActivity extends AppCompatActivity {

    private Button button_opatrunki;
    private Button button_gaziki;
    private Button button_woda;
    private Button button_bandaz;
    private Button button_plastry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apteczka);

        button_opatrunki = findViewById(R.id.opatrunki);
        button_gaziki = findViewById(R.id.gaziki);
        button_woda = findViewById(R.id.woda_utleniona);
        button_bandaz = findViewById(R.id.bandaz);
        button_plastry = findViewById(R.id.plastry_na_drobne_otarcia);

        button_opatrunki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_opatrunki.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ApteczkaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_gaziki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_gaziki.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ApteczkaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_woda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_woda.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ApteczkaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_bandaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_bandaz.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ApteczkaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_plastry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_plastry.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ApteczkaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
    }
}