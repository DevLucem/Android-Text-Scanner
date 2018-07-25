package com.lucem.anb.characterscanner;

public interface DetectionsListener {
    void state(String state);
    void detections(String detections, long numbersLong, int numbersInt);
}
