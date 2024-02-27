package com.example.practical21;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("API123", " " + intent.getAction());
        if (intent.getAction().equals("com.example.practical21.SOME_ACTION")) {
            Toast.makeText(context, "SOME_ACTION is recieved", Toast.LENGTH_LONG).show();
        } else {
            ConnectivityManager em = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = em.getActiveNetworkInfo();
            boolean isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();
            if (isConnected) {
                try {
                    Toast.makeText(context, "Network is Connected", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Toast.makeText(context, "Network is Changed or Reconnected", Toast.LENGTH_LONG).show();
            }
        }
    }
}

