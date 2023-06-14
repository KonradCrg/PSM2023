package com.example.twoj_bagaz.ubrania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoj_bagaz.R;
import com.example.twoj_bagaz.WybraneUbranieActivity;

public class KoszulkiActivity extends AppCompatActivity{

    private Button button_t_shirt;
    private Button button_koszulka_na_ramiaczkach;
    private Button button_polo;
    private Button button_sleeve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koszulki);
        button_t_shirt = findViewById(R.id.t_shirt);
        button_koszulka_na_ramiaczkach = findViewById(R.id.koszulka_na_ramiaczkach);
        button_polo = findViewById(R.id.koszulka_polo);
        button_sleeve= findViewById(R.id.long_sleeve);


        button_t_shirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_t_shirt.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KoszulkiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });

        button_koszulka_na_ramiaczkach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_koszulka_na_ramiaczkach.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KoszulkiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);

            }
        });

        button_polo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_polo.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KoszulkiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);

            }
        });

        button_sleeve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_sleeve.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(KoszulkiActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);

            }
        });
    }
}