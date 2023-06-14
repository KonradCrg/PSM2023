package com.example.twoj_bagaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    Button button;
    TextView textView;
    FirebaseUser user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();
        button = findViewById(R.id.logout);
        textView = findViewById(R.id.textView5);
        user = auth.getCurrentUser();
        if (user == null){
            Intent intent = new Intent(getApplicationContext(), LogowanieActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            textView.setText(user.getEmail());
        }

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), LogowanieActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private static final int TIME_INTERVAL = 2000;

    private long mBackPressed;

    @Override
    public void onBackPressed() {
        if(mBackPressed+TIME_INTERVAL>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(this, "Nacisnij dwa razy aby wyjść", Toast.LENGTH_SHORT).show();
        }
        mBackPressed = System.currentTimeMillis();
    }

    public void Button_Ubrania(View view) {
        Intent intent = new Intent(MainActivity.this, UbraniaActivity.class);
        startActivity(intent);
    }

    public void Button_Elektronika(View view) {
        Intent intent = new Intent(MainActivity.this, ElektronikaActivity.class);
        startActivity(intent);
    }

    public void Button_Kosmetyki(View view) {
        Intent intent = new Intent(MainActivity.this, KosmetykiActivity.class);
        startActivity(intent);
    }

    public void Button_Wazne_dok(View view) {
        Intent intent = new Intent(MainActivity.this, Wazne_dokActivity.class);
        startActivity(intent);
    }

    public void Button_Apteczka(View view) {
        Intent intent = new Intent(MainActivity.this, ApteczkaActivity.class);
        startActivity(intent);
    }

    public void onImageClick(View view) {
        Intent intent = new Intent(MainActivity.this, WybraneUbranieActivity.class);
        startActivity(intent);
    }


}