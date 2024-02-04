package com.example.practical14_1;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] listItem;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.listview);
        textView=(TextView) findViewById(R.id.textview);
        listItem = getResources().getStringArray(R.array.array_technonlogy);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.mylist, R.id.textview, listItem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int
                    position, long l) {
                String value=adapter.getItem(position);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}