package com.example.practical9_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    TextView t;
    EditText e1,e2;
    Button add,sub,mul,div;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView) findViewById(R.id.tb1);
        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        add=(Button) findViewById(R.id.bt1);
        sub=(Button) findViewById(R.id.bt2);
        mul=(Button) findViewById(R.id.bt3);
        div=(Button) findViewById(R.id.bt4);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                int add=num1+num2;
                t.setText("Addition of "+e1.getText().toString()+" and "+e2.getText().toString()+" is "+add);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                int sub=num1-num2;
                t.setText("Subtraction of "+e1.getText().toString()+" and "+e2.getText().toString()+" is "+sub);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                int mul=num1*num2;
                t.setText("Multiplication of "+e1.getText().toString()+" and "+e2.getText().toString()+"is"+mul);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                int div=num1/num2;
                t.setText("Division of "+e1.getText().toString()+" and "+e2.getText().toString()+" is "+div);
            }
        });
    }}