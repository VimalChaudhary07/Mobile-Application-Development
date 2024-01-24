package com.example.practical9_1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
    private ToggleButton tb0,tb1;
    private ImageButton ib0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick() {
        tb0 = (ToggleButton) findViewById(R.id.tb1);
        tb1 = (ToggleButton) findViewById(R.id.tb2);
        ib0 = (ImageButton) findViewById(R.id.ib);
        ib0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Bluetooth:-" + tb0.getText() +
                        "\nBluetooth:- " + tb1.getText();
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            } });
    }}