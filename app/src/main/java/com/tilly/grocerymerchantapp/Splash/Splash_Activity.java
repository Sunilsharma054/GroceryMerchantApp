package com.tilly.grocerymerchantapp.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.tilly.grocerymerchantapp.Login.LoginActivity;
import com.tilly.grocerymerchantapp.R;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash_Activity.this, LoginActivity.class));
                finish();
            }
        }, secondsDelayed * 2200);
    }
}
