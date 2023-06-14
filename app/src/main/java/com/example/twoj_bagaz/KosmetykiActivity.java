package com.example.twoj_bagaz;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KosmetykiActivity extends AppCompatActivity{

    private Button szampon;
    private Button chusteczki;
    private Button recznik;
    private Button kremdorak;
    private Button kremdoopalania;
    private Button dezodorant;
    private Button szuszarka;
    private Button szczotka;
    private Button poasta;
    private Button art;
    private Button akcesoria;
    private Button maszynka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosmetyki);

        szampon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = szampon.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        chusteczki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = chusteczki.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        recznik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = recznik.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        kremdoopalania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = kremdoopalania.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        kremdorak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = kremdorak.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        dezodorant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = dezodorant.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        szuszarka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = szuszarka.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        szczotka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = szczotka.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        poasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = poasta.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = art.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        akcesoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = akcesoria.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        maszynka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = maszynka.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KosmetykiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
    }
}
