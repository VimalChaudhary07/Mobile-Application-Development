package com.example.practical14_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gv1;
    String arr[] = new String[15];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv1 = (GridView) findViewById(R.id.gv);
        for (int i=0;i<15;i++)
        {
            arr[i] = Integer.toString(i+1);
        }
        ArrayAdapter<String> ad=new ArrayAdapter<>(this,R.layout.grid_item,R.id.btn,arr);
        gv1.setAdapter(ad);
    }
}