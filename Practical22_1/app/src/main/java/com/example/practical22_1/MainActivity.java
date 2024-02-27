package com.example.practical22_1;
import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    SensorManager sm = null;
    TextView textView = null;
    ListView list;
    SensorEventListener sel = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] values = sensorEvent.values;
            textView.setText("x: " + values[0] + "\ny: " + values[1] + "\nz: " + values[2]);
        }
        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        textView = findViewById(R.id.textview1);
        list = findViewById(R.id.listView);
        if (sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
            sm.registerListener(sel, sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL); // Registering listener
        } else {
            Toast.makeText(getBaseContext(),"Error: No Accelerometer.",Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onStop() {
        sm.unregisterListener(sel);
        super.onStop();
    }
}
