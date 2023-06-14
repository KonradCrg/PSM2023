package com.example.twoj_bagaz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WybraneUbranieActivity extends AppCompatActivity {

    private TextView textViewSelectedOption;
    private Button buttonDodajPrzedmiot;
    private EditText editTextPrzedmiot;
    private ListView listViewPrzedmioty;

    private ArrayAdapter<String> adapter;
    private ArrayList<String> przedmiotyList;

    private static final String SHARED_PREFS_KEY = "com.example.twoj_bagaz.SHARED_PREFS_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wybrane_ubranie);

        textViewSelectedOption = findViewById(R.id.textViewResult);
        buttonDodajPrzedmiot = findViewById(R.id.buttonDodajPrzedmiot);
        listViewPrzedmioty = findViewById(R.id.listViewPrzedmioty);

        przedmiotyList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, przedmiotyList);
        listViewPrzedmioty.setAdapter(adapter);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("selectedOption")) {
            String selectedOption = intent.getStringExtra("selectedOption");
            textViewSelectedOption.setText(selectedOption);
        }

        loadPrzedmiotyFromSharedPreferences();

        buttonDodajPrzedmiot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String przedmiot = textViewSelectedOption.getText().toString();
                if (!przedmiot.isEmpty()) {
                    przedmiotyList.add(przedmiot);
                    adapter.notifyDataSetChanged();
                    textViewSelectedOption.setText("");
                    savePrzedmiotyToSharedPreferences();
                }
            }
        });
    }

    private void loadPrzedmiotyFromSharedPreferences() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);
        Set<String> przedmiotySet = sharedPreferences.getStringSet("przedmiotySet", new HashSet<>());
        przedmiotyList.addAll(przedmiotySet);
        adapter.notifyDataSetChanged();
    }

    private void savePrzedmiotyToSharedPreferences() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putStringSet("przedmiotySet", new HashSet<>(przedmiotyList));
        editor.apply();
    }
}
