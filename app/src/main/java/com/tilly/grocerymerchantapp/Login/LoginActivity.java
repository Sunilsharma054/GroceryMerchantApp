package com.tilly.grocerymerchantapp.Login;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tilly.grocerymerchantapp.Home.Home_Activity;
import com.tilly.grocerymerchantapp.R;
import com.tilly.grocerymerchantapp.Register.Register;

public class LoginActivity extends AppCompatActivity {
    Button cirLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_main);
        cirLoginButton = findViewById(R.id.cirLoginButton);
        cirLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, Home_Activity.class);
                startActivity(intent);
            }
        });

    }
    public void onLoginClick(View View){
        startActivity(new Intent(this, Register.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
}
