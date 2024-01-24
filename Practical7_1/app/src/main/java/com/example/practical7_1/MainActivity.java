package com.example.practical7_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText rn=(EditText) findViewById(R.id.edit1);
        EditText n=(EditText) findViewById(R.id.edit2);

        TextView t1=(TextView) findViewById(R.id.tv1);
        TextView t2=(TextView) findViewById(R.id.tv2);
        TextView t3=(TextView) findViewById(R.id.tv3);
        TextView t4=(TextView) findViewById(R.id.tv4);

        Button b=(Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                if (rn.getText().toString().isEmpty()||n.getText().toString().isEmpty()||n.getText().toString().isEmpty()) {
                t3.setText("All Fields are Mandatory..!!");
            }
               else
                {
                    t4.setText("You have Sucessfully logged into Your Profile...!!!");
                }
            }
        });
    }
}