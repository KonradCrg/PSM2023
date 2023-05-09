package com.example.twoj_bagaz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button_Ubrania(View view) {
        Intent intent = new Intent(MainActivity.this, UbraniaActivity.class);
        startActivity(intent);
    }

    public void Button_Elektronika(View view) {
    }

    public void Button_Kosmetyki(View view) {
    }

    public void Button_Wazne_dok(View view) {
    }

    public void Button_Apteczka(View view) {
    }
}