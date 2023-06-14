package com.example.twoj_bagaz.ubrania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoj_bagaz.R;
import com.example.twoj_bagaz.WybraneUbranieActivity;

public class OkryciewierzchneActivity extends AppCompatActivity {

    private Button button_zimowa;
    private Button button_wiatrowka;
    private Button button_katana;
    private Button button_wierzchnia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okryciewierzchne);
        button_katana = findViewById(R.id.katana);
        button_wiatrowka = findViewById(R.id.kurtka_wiatrowa);
        button_zimowa = findViewById(R.id.kurtka_zimowa);
        button_wierzchnia = findViewById(R.id.koszula_wierzchna);



        button_zimowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_zimowa.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(OkryciewierzchneActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });

        button_wierzchnia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_wierzchnia.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(OkryciewierzchneActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_katana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_katana.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(OkryciewierzchneActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
        button_wiatrowka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_wiatrowka.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(OkryciewierzchneActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });
    }
}