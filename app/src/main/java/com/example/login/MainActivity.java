package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.togglebtn);
        btn.setOnClickListener(view -> {
            if (btn.isChecked()){
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            } else {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}