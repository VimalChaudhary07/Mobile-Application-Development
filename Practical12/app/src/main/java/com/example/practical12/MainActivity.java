package com.example.practical12;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton b1,b2,b3;
    RadioGroup rg;
    Button bt1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup) findViewById(R.id.rg1);
        bt1=(Button) findViewById(R.id.btn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedID = rg.getCheckedRadioButtonId();
                b3 = (RadioButton) findViewById(selectedID);
                b1 = (RadioButton) findViewById(R.id.rb1);
                b2 = (RadioButton) findViewById(R.id.rb2);
                StringBuffer msg = new StringBuffer();
                if (b1.isChecked())
                {
                    msg.append(b1.getText()).append("is selected\n");
                }
                if (b2.isChecked())
                {
                    msg.append(b2.getText()).append("is selected");
                }
                if (b3.isChecked())
                {
                    msg.append("\n RadioGroup").append(b3.getText());
                }
                Toast.makeText(getApplicationContext(),msg.append("are Selected").toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}