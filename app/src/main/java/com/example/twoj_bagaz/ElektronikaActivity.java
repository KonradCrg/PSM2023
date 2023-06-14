package com.example.twoj_bagaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ElektronikaActivity extends AppCompatActivity{

    private Button button_tablet;
    private Button button_tel;
    private Button button_arapat;
    private Button button_klawia;
    private Button button_sluchawki;
    private Button button_latarka;
    private Button button_laptop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elektronika);

        button_arapat = findViewById(R.id.aparat_cyfrowy);
        button_klawia = findViewById(R.id.klawiatura_i_myszka);
        button_tablet = findViewById(R.id.tablet);
        button_laptop = findViewById(R.id.laptop_i_ladowarka);
        button_latarka = findViewById(R.id.latarka);
        button_sluchawki = findViewById(R.id.sluchawki_bezprzewodowe_i_przewodowe);
        button_tel = findViewById(R.id.telefon_i_ladowarka);




        button_arapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_arapat.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ElektronikaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_klawia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_klawia.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ElektronikaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_tablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_tablet.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ElektronikaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_laptop.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ElektronikaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_latarka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_latarka.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ElektronikaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_tel.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ElektronikaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_sluchawki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_sluchawki.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(ElektronikaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
    }
}
