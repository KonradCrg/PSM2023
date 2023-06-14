package com.example.twoj_bagaz.ubrania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoj_bagaz.R;
import com.example.twoj_bagaz.WybraneUbranieActivity;

public class SpodnieActivity extends AppCompatActivity{

    private Button button_jeansowe;
    private Button button_dresowe;
    private Button button_krotkiespodenki;
    private Button button_plazowe;
    private Button button_eleganckie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spodnie);

        button_dresowe = findViewById(R.id.spodnie_dresowe);
        button_eleganckie = findViewById(R.id.spodnie_eleganckie);
        button_krotkiespodenki = findViewById(R.id.krotkie_spodenki);
        button_plazowe = findViewById(R.id.spodenki_plazowe);
        button_jeansowe = findViewById(R.id.spodnie_jeansowe);


        button_dresowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_dresowe.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(SpodnieActivity.this, WybraneUbranieActivity.class);
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
                Intent intent = new Intent(SpodnieActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_krotkiespodenki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_krotkiespodenki.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(SpodnieActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_jeansowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_jeansowe.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(SpodnieActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_eleganckie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_eleganckie.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(SpodnieActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
    }
}
