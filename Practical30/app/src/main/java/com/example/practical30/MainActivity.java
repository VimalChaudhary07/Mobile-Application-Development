package com.example.practical30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        e3 = findViewById(R.id.edit3);
        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rec = e1.getText().toString();
                String[] rec1 = rec.split(",");
                String sub = e2.getText().toString();
                String msg = e3.getText().toString();
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL,rec1);
                i.putExtra(Intent.EXTRA_SUBJECT,sub);
                i.putExtra(Intent.EXTRA_TEXT,msg);
                i.setType("message/rfc822");
                startActivity(Intent.createChooser(i,"Message Send Sucessfully"));
            }
        });
    }
}