package com.example.practical15_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    Button btn;
    int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.cb1);
        c2 = (CheckBox) findViewById(R.id.cb2);
        c3 = (CheckBox) findViewById(R.id.cb3);
        btn = (Button) findViewById(R.id.bt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=0;
                StringBuffer sb=new StringBuffer();
                sb.append("Selected item:");
                if (c1.isChecked()){
                    sb.append("\n Pizza = 150RS");
                    total+=150;
                }
                if (c2.isChecked()){
                    sb.append("\n Coffee = 50RS");
                    total+=50;
                }
                if (c3.isChecked()){
                    sb.append("\n Burger = 120RS");
                    total+=120;
                }
                sb.append("\n Total: "+total+"RS");
                Toast.makeText(getApplicationContext(),sb.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}