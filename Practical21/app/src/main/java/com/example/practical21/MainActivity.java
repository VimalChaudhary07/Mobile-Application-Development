package com.example.practical21;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MyReciever receiver;
    IntentFilter intentFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intentFilter = new IntentFilter("com.example.practical21.SOME_ACTION");
    }
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(receiver,intentFilter);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
    public void broadcastIntent(View view) {
        Intent intent = new Intent("com.example.practical21.SOME_ACTION");
        sendBroadcast(intent);
    }
}