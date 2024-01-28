package com.example.practical13_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ProgressDialog progressBar;
    int progressBarStatus = 0;
    long fileSize = 0;
    Handler progressBarHandler = new Handler();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.bt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar = new ProgressDialog(view.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("File downloading");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.show();
                progressBarStatus=0;
                fileSize = 0;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressBarStatus < 100){
                            progressBarStatus = downloadFile();
                            try {
                                Thread.sleep(1000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            progressBarHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progressBarStatus);
                                }
                            });
                        }
                        if (progressBarStatus >= 100){
                            try {
                                Thread.sleep(2000);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                            progressBar.dismiss();
                        }
                    }
                }).start();
            }
        });
    }
    public int downloadFile(){
        while (fileSize <= 1000000){
            fileSize++;
            if (fileSize == 100000){
                return 10;
            }if (fileSize == 200000){
                return 20;
            }if (fileSize == 300000){
                return 30;
            }if (fileSize == 400000){
                return 40;
            }if (fileSize == 500000){
                return 50;
            }if (fileSize == 600000){
                return 60;
            }if (fileSize == 700000){
                return 70;
            }if (fileSize == 800000){
                return 80;
            }if (fileSize == 900000){
                return 90;
            }
        }
        return 100;
    }
}