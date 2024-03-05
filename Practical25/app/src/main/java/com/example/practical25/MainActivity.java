package com.example.practical25;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        Button rotateClockwiseBtn = findViewById(R.id.rotateClockwiseBtn);
        rotateClockwiseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateImage(90);
            }
        });

        Button rotateAntiClockwiseBtn = findViewById(R.id.rotateAntiClockwiseBtn);
        rotateAntiClockwiseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateImage(-90);
            }
        });

        Button zoomInBtn = findViewById(R.id.zoomInBtn);
        zoomInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomImage(2f);
            }
        });

        Button zoomOutBtn = findViewById(R.id.zoomOutBtn);
        zoomOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomImage(0.5f);
            }
        });

        Button fadeInBtn = findViewById(R.id.fadeInBtn);
        fadeInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeInImage();
            }
        });

        Button fadeOutBtn = findViewById(R.id.fadeOutBtn);
        fadeOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeOutImage();
            }
        });
    }

    private void rotateImage(float degree) {
        imageView.animate().rotationBy(degree).setDuration(500).start();
    }

    private void zoomImage(float scale) {
        imageView.animate().scaleX(scale).scaleY(scale).setDuration(500).start();
    }

    private void fadeInImage() {
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(imageView, "alpha", 0f, 1f);
        alphaAnimator.setDuration(500);
        alphaAnimator.start();
    }

    private void fadeOutImage() {
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(imageView, "alpha", 1f, 0f);
        alphaAnimator.setDuration(500);
        alphaAnimator.start();
    }
}
