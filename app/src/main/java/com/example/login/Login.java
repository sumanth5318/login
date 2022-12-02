package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username_et);
        password = findViewById(R.id.password_et);
        btn_login = findViewById(R.id.login_btn);
        btn_login.setOnClickListener(view -> {
            if(username.getText().toString().equals("sumu")&&password.getText().toString().equals("1234")){
                Toast.makeText(this, "you are logged in", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Please enter valid login credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}