package com.example.practical28;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText uemail,upass;
    public String Uuseremail,Uuserpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.User_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });
        uemail = findViewById(R.id.user_email);
        upass = findViewById(R.id.user_password);
    }
    public void check() {
        Uuseremail = uemail.getText().toString().trim();
        Uuserpassword = upass.getText().toString().trim();
        if (Uuserpassword.isEmpty()) {
            uemail.setError("Enter An Email.");
            uemail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(Uuseremail).matches()) {
            uemail.setError("Enter a valid Email.");
            uemail.requestFocus();
            return;
        }
        if (Uuserpassword.isEmpty()) {
            upass.setError("Enter a Password");
            upass.requestFocus();
            return;
        }
        if (Uuserpassword.length()<6) {
            upass.setError("Minimum length is 6 character");
            upass.requestFocus();
            return;
        }
        if (Uuseremail.equals("vimalchaudhary011@gmail.com") && Uuserpassword.equals("vimalchaudhary011")) {
            Toast.makeText(MainActivity.this,"Welcome User",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,empty_activity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"Wrong Email Or Password",Toast.LENGTH_LONG).show();
        }
    }
}