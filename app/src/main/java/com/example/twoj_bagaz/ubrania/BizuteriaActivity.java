package com.example.twoj_bagaz.ubrania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoj_bagaz.R;
import com.example.twoj_bagaz.WybraneUbranieActivity;

public class BizuteriaActivity extends AppCompatActivity {

    private Button button_zegarek;
    private Button button_pierscionek;
    private Button button_naszyjnik;
    private Button button_bransoletka;
    private Button button_okulary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bizuteria);
        button_zegarek = findViewById(R.id.zegarek);
        button_bransoletka = findViewById(R.id.bransoletka);
        button_okulary = findViewById(R.id.okulary_przeciw_sloneczne);
        button_naszyjnik = findViewById(R.id.naszyjnik);
        button_pierscionek = findViewById(R.id.pierscionek);


        button_zegarek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_zegarek.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(BizuteriaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });

        button_pierscionek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_pierscionek.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(BizuteriaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_bransoletka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_bransoletka.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(BizuteriaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_okulary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_okulary.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(BizuteriaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_naszyjnik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_naszyjnik.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(BizuteriaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
    }
}