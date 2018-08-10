package com.lucem.anb.characterscanner;

public interface ScannerListener {
    void onDetected(String detections);
    void onStateChanged(String state, int i);
}
