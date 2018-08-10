package com.lucem.anb.characterscanner;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;

public class ScannerView extends SurfaceView {

    private String state = "";
    private boolean scanning = false;
    private ScannerListener listener;

    public ScannerView(Context context) {
        super(context);
    }

    public ScannerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScannerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setOnDetectedListener(Activity activity, ScannerListener listener){
        this.listener = listener;
        scanning = true;
        new Scanner(activity, this, listener);
    }

    protected void onDetected(String detections){
        Log.d("detections", detections);
    }

    protected void onStateChanged(String state, int i) {
        Log.d("state", state + " # " + i);
    }

    public String getState() {
        return state;
    }

    public boolean isScanning(){return scanning;}
}
