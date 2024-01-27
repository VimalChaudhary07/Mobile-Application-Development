package com.example.practical11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox) findViewById(R.id.cb1);
        c2=(CheckBox) findViewById(R.id.cb2);
        c3=(CheckBox) findViewById(R.id.cb3);
        c4=(CheckBox) findViewById(R.id.cb4);
        c5=(CheckBox) findViewById(R.id.cb5);
        btn=(Button) findViewById(R.id.b1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!c1.isChecked()&&!c2.isChecked()&&!c3.isChecked()&&!c4.isChecked()&&!c5.isChecked()){
                    String mssg="You have not selected any Hobbies";
                    Toast.makeText(MainActivity.this,mssg,Toast.LENGTH_LONG).show();
                }
                else{
                    String mssg="You have Selected";
                    if (c1.isChecked())
                        mssg=mssg+"\nPhotography";
                    if (c2.isChecked())
                        mssg=mssg+"\nCollecting";
                    if (c3.isChecked())
                        mssg=mssg+"\nSculpture";
                    if (c4.isChecked())
                        mssg=mssg+"\nCooking";
                    if (c5.isChecked())
                        mssg=mssg+"\nGardening";
                    Toast.makeText(MainActivity.this,mssg+"As Hobbies",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}