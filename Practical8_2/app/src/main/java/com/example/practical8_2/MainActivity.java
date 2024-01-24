package com.example.practical8_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] subject = {"Management", "Network and Information Security", "Emerging Trends",
            "Android"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.select_dialog_item,
                subject);
        AutoCompleteTextView ac = (AutoCompleteTextView)
                findViewById(R.id.actv);
        ac.setThreshold(1);
        ac.setAdapter(adapter);
    }
}



