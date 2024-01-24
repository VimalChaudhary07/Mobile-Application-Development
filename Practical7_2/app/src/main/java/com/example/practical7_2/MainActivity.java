package com.example.practical7_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText rn = (EditText) findViewById(R.id.edit1);

        EditText n = (EditText) findViewById(R.id.edit2);

        EditText bn = (EditText) findViewById(R.id.edit4);

        EditText cn = (EditText) findViewById(R.id.edit4);

        EditText dob = (EditText) findViewById(R.id.edit5);

        EditText mno = (EditText) findViewById(R.id.edit6);

        EditText pers = (EditText) findViewById(R.id.edit7);

        TextView t8 = (TextView) findViewById(R.id.tv8);
        TextView t9 = (TextView) findViewById(R.id.tv9);
        TextView t10 = (TextView) findViewById(R.id.tv10);
        TextView t11 = (TextView) findViewById(R.id.tv11);
        TextView t12 = (TextView) findViewById(R.id.tv12);
        TextView t13 = (TextView) findViewById(R.id.tv13);
        TextView t14 = (TextView) findViewById(R.id.tv14);
        TextView t15 = (TextView) findViewById(R.id.tv15);

        Button b = (Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if
                (rn.getText().toString().isEmpty() ||n.getText().toString().isEmpty()
                        ||bn.getText().toString().isEmpty() || cn.getText().toString().isEmpty()||
                        dob.getText().toString()
                                .isEmpty() || mno.getText().toString().isEmpty() || pers.getText().toString().isEmpty())
                {
                    t8.setText("All Field are Mandatory");
                }
                else
                {
                    t9.setText("Roll no:" + rn.getText().toString());
                    t10.setText("Name:" + n.getText().toString());
                    t11.setText("Branch:"+bn.getText().toString());
                    t12.setText("College:"+cn.getText());
                    t13.setText("DOB:" + dob.getText().toString());
                    t14.setText("Mobile No:" + mno.getText().toString());
                    t15.setText("Percentage:" + pers.getText().toString());
                }
            }
        });
    }
}