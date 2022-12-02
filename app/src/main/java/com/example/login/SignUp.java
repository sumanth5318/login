package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SignUp extends AppCompatActivity {
    EditText first_name,last_name,username,password,email;
    Button btnregister;
    ArrayList<String> listusername=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        first_name = findViewById(R.id.et_firstname);
        last_name = findViewById(R.id.et_lastname);
        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        email = findViewById(R.id.et_mail);
        btnregister = findViewById(R.id.btn_register);
        btnregister.setOnClickListener(View ->{
            validatetexts();
            if(validateusername(username)){
                Toast.makeText(this,"username taken please enter another username",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this,"you are succesfully registered",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                alertDialog.setMessage("Are you sure!");
                alertDialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                       first_name.setText("");
                       last_name.setText("");
                       username.setText("");
                       password.setText("");
                       email.setText("");
                    }
                });
                alertDialog.setNegativeButton("cancel",null);
                alertDialog.create();
                alertDialog.show();
            }
        });
    }
    public void validatetexts(){
        if(first_name.getText().toString().equals("")){
            Toast.makeText(this, "Enter first name", Toast.LENGTH_SHORT).show();
        }else if(last_name.getText().toString().equals("")){
            Toast.makeText(this,"Enter last name",Toast.LENGTH_SHORT).show();
        }else if(email.getText().toString().equals("")) {
            Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show();
        }else if(username.getText().toString().equals("")) {
            Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show();
        }else if(password.getText().toString().equals("")){
            Toast.makeText(this,"Enter password",Toast.LENGTH_SHORT).show();
        }
    }
    public boolean validateusername(EditText username){
        boolean flag = false;
        for(String i:listusername){
            listusername.add(username.getText().toString());
            flag = true;
        }
        return flag;
    }
}