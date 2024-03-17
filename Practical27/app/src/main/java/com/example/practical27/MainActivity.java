package com.example.practical27;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;
    private static final String VALID_USERNAME = "vimal";
    private static final String VALID_PASSWORD = "chaudhary";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (isValidCredentials(username, password)) {
                    showToast("Login successful");
                } else {
                    showToast("Login unsuccessful. Please check your credentials.");
                }
            }
        });
    }
    private boolean isValidCredentials(String username, String password) {
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}