package com.example.practical18_3;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num;
    int ans;
    Button b;
    static String msg="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.et1);
        b = (Button) findViewById(R.id.bt1);
    }
    public void opensecond(View view)
    {
        Intent intent = new Intent(this,ActivitySecond.class);
        startActivity(intent);
        String value = num.getText().toString();
        int num1 = parseInt(value);
        ans = fact(num1);
        msg = msg+ans;
    }
    public static String getMyString()
    {
        return msg;
    }
    private int fact(int nume)
    {
        if (nume<2) {
            return 1;
        } else {
            return nume*fact(nume-1);
        }
    }
}