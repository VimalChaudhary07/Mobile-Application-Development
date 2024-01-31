package com.example.practical14_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button bt;
    ImageView iv;
    boolean flag;
    int images[]={R.drawable.imoo1,R.drawable.imoo2,R.drawable.imoo3,R.drawable.imoo4,R.drawable.imoo5,R.drawable.imoo6,R.drawable.imoo7};
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv1);
        bt = (Button) findViewById(R.id.btn);
        flag = true;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setImageResource(images[i]);
                i++;
                if(i==7)
                    i=0;
            }
        });
    }
}