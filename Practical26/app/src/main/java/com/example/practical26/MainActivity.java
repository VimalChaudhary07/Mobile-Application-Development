package com.example.practical26;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private Button buttonSave;
    private MyDatabaseHelper myDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        buttonSave = findViewById(R.id.buttonSave);

        myDatabaseHelper = new MyDatabaseHelper(this);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String ageStr = editTextAge.getText().toString();
                int age = Integer.parseInt(ageStr);

                new InsertDataTask().execute(name, age);
            }
        });
    }

    private class InsertDataTask extends AsyncTask<Object, Void, Boolean> {

        @Override
        protected Boolean doInBackground(Object... params) {
            String name = (String) params[0];
            int age = (int) params[1];

            return myDatabaseHelper.insertData(name, age);
        }

        @Override
        protected void onPostExecute(Boolean result) {
            if (result) {
                Toast.makeText(MainActivity.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Failed to insert data", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
