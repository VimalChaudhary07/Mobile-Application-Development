package com.example.practical8_1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] fruits={"Apple","Custard Apple","Pineapple","Apricot","Banana","Cherry","Coconut",
            "Dragon Fruit","Dates","Mango","Raspberry","Strawberry","Watermelon","Guava"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.select_dialog_item, fruits);
        AutoCompleteTextView ac = (AutoCompleteTextView)
                findViewById(R.id.actv);
        ac.setThreshold(1);
        ac.setAdapter(adapter);
    }
}