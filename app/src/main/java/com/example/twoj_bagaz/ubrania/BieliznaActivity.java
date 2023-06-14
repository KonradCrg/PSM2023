package com.example.twoj_bagaz.ubrania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoj_bagaz.R;
import com.example.twoj_bagaz.WybraneUbranieActivity;

public class BieliznaActivity extends AppCompatActivity{


    private Button button_skarpetki;
    private Button button_bokserki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bielizna);

        button_skarpetki = findViewById(R.id.skarpetki);
        button_bokserki= findViewById(R.id.bokserki);


        button_skarpetki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_skarpetki.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(BieliznaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);
            }
        });

        button_bokserki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pobierz tekst, który chcesz przekazać
                String selectedOption = button_bokserki.getText().toString();

                // Tworzenie i konfiguracja Intencji
                Intent intent = new Intent(BieliznaActivity.this, WybraneUbranieActivity.class);
                intent.putExtra("selectedOption", selectedOption);

                // Uruchom DrugieActivity
                startActivity(intent);

            }
        });
    }
}
