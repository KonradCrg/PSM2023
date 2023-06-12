package com.example.twoj_bagaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.twoj_bagaz.R;

public class UbraniaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubrania);
    }

    public void Button_Ubrania(View view) {
        Intent intent = new Intent(UbraniaActivity.this, KoszulkiActivity.class);
        startActivity(intent);
    }

    public void Button_Spodnie(View view) {
        Intent intent = new Intent(UbraniaActivity.this, SpodnieActivity.class);
        startActivity(intent);
    }

}