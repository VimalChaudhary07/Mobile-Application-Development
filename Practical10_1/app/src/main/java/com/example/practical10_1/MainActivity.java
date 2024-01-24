package com.example.practical10_1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText el, e2;
    Button bl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        el = findViewById(R.id.uid);
        e2 = findViewById(R.id.pswd);
        bl = findViewById(R.id.btn);
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Login", "Login button clicked");
                String username = el.getText().toString();
                String password = e2.getText().toString();
                if (username.equals("sujal") && password.equals("bhul")) {
                    showToast("Login successful");
                } else {
                    showToast("Login failed. Please enter valid username and password.");
                }
            }
        });
    }
    private void showToast(String message) {
        Log.d("Login", "Showing Toast: " + message);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}