package com.lucem.scanexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.Toast;

import com.lucem.anb.characterscanner.Scanner;
import com.lucem.anb.characterscanner.ScannerListener;
import com.lucem.anb.characterscanner.ScannerView;
import com.lucem.scanexample.R;

public class MainActivity extends AppCompatActivity{

    SurfaceView surfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SurfaceView surfaceView = findViewById(R.id.surface);
        Scanner scanner = new Scanner(this, surfaceView, new ScannerListener() {
            @Override
            public void onDetected(String detections) {
            
            }

            @Override
            public void onStateChanged(String state, int i) {

            }
        });

    }
}
