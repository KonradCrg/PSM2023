package com.example.twoj_bagaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Wazne_dokActivity extends AppCompatActivity{

    private Button plyn;
    private Button dokumenty;
    private Button pieniadze_waluta;
    private Button bilety;
    private Button powerbank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wazne_dok);

        plyn = findViewById(R.id.plyn_do_dezynfekcji);
        dokumenty = findViewById(R.id.dokumenty);
        pieniadze_waluta = findViewById(R.id.pieniadze_w_danej_walucie);
        bilety = findViewById(R.id.bilety);
        powerbank = findViewById(R.id.powerbank);


        plyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = plyn.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(Wazne_dokActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        dokumenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = dokumenty.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(Wazne_dokActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        pieniadze_waluta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = pieniadze_waluta.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(Wazne_dokActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        bilety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = bilety.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(Wazne_dokActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        powerbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = powerbank.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(Wazne_dokActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
    }
}
