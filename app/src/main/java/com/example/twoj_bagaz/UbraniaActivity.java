package com.example.twoj_bagaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoj_bagaz.ubrania.BieliznaActivity;
import com.example.twoj_bagaz.ubrania.BizuteriaActivity;
import com.example.twoj_bagaz.ubrania.ButyActivity;
import com.example.twoj_bagaz.ubrania.KoszulkiActivity;
import com.example.twoj_bagaz.ubrania.OkryciewierzchneActivity;
import com.example.twoj_bagaz.ubrania.SpodnieActivity;

public class UbraniaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubrania);
    }

    public void Button_Koszulki(View view) {
        Intent intent = new Intent(UbraniaActivity.this, KoszulkiActivity.class);
        startActivity(intent);
    }

    public void Button_Spodnie(View view) {
        Intent intent = new Intent(UbraniaActivity.this, SpodnieActivity.class);
        startActivity(intent);
    }

    public void Button_Bizuteria(View view) {
        Intent intent = new Intent(UbraniaActivity.this, BizuteriaActivity.class);
        startActivity(intent);
    }

    public void Button_Bielizna(View view) {
        Intent intent = new Intent(UbraniaActivity.this, BieliznaActivity.class);
        startActivity(intent);
    }

    public void Button_Obuwie(View view) {
        Intent intent = new Intent(UbraniaActivity.this, ButyActivity.class);
        startActivity(intent);
    }

    public void Button_Okryciewierzchne(View view) {
        Intent intent = new Intent(UbraniaActivity.this, OkryciewierzchneActivity.class);
        startActivity(intent);
    }

}