package com.example.twoj_bagaz.ubrania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoj_bagaz.R;
import com.example.twoj_bagaz.WybraneUbranieActivity;

import java.util.ArrayList;

public class OkryciewierzchneActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    private ArrayList<String> listaPrzedmiotow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okryciewierzchne);

        listaPrzedmiotow = new ArrayList<>();
    }

    public void onButtonClick(View view) {
        String selectedOption = "";
        switch (view.getId()) {
            case R.id.kurtka_wiatrowa:
                selectedOption = "Kurtka wiatrowa";
                break;
            case R.id.kurtka_zimowa:
                selectedOption = "Kurtka zimowa";
                break;
            case R.id.katana:
                selectedOption = "Kurtka jeansowa (katana)";
                break;
            case R.id.koszula_wierzchna:
                selectedOption = "Koszula wierzchnia";
                break;
        }

        Intent intent = new Intent(this, WybraneUbranieActivity.class);
        intent.putExtra("selectedOption", selectedOption);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            String returnedValue = data.getStringExtra("returnValue");
            if (returnedValue != null) {
                listaPrzedmiotow.add(returnedValue);
            }
        }
    }
}
