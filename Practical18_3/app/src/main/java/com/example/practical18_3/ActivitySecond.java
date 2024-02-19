package com.example.practical18_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String myvalue=MainActivity.getMyString();
        text1 = (TextView) findViewById(R.id.tv1);
        text1.setText("Factroial of Entered Number:"+myvalue);
    }
}