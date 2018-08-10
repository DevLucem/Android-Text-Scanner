# Text and Numbers Recognizer [![Lucem](https://camo.githubusercontent.com/cfcaf3a99103d61f387761e5fc445d9ba0203b01/68747470733a2f2f7472617669732d63692e6f72672f6477796c2f657374612e7376673f6272616e63683d6d6173746572)](https://about.me/lucem-anb) [![](https://jitpack.io/v/Lucem-Anb/android-text-scanner.svg)](https://jitpack.io/#Lucem-Anb/android-text-scanner)
This library is an easy to implement and use for scanning text and numbers using the camera (Optical Character Recognition) on android devices

![Scan Sample](http://i.imgur.com/YukmNOz.png)

### Implementation 
Add jitpack to repositories in the root build.gradle file

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add this dependency line in your build.gradle **app level**

```
dependencies {
	implementation 'com.github.Lucem-Anb:android-text-scanner:@Version'
}
```
:smiley::smiley::smiley::smiley::smiley::smiley::smiley::smiley:

### Usage

This library uses the `SurfaceView` to display the camera. Detected values are accessed using a listener. There are
two ways of using this library, let's start with the simple one

#### Option 1
Create the ScannerView in your Activity or fragment
```
<com.lucem.anb.characterscanner.ScannerView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/scanner"/>
```

Start the scan whenever you want
```
ScannerView scanner = findViewById(R.id.scanner);
scanner.setOnDetectedListener(this, new ScannerListener() {
            @Override
            public void onDetected(String detections) {
                Toast.makeText(MainActivity.this, detections, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStateChanged(String state, int i) {
                Log.d("state", state);
            }
        });
```

#### Option 2
Create a surface view in your activity or fragment
```
<SurfaceView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/surface"/>
```

Initialize your Scanner and pass your activity and surface view

```
SurfaceView surfaceView = findViewById(R.id.surface);
Scanner scanner = new Scanner(this, surfaceView, new ScannerListener() {
        @Override
        public void onDetected(String detections) {
            Toast.makeText(MainActivity.this, detections, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStateChanged(String state, int i) {
            Log.d("state", state);
        }
    });
    
```

#### More Customization

`showToasts(boolean);` Enable or disable recognition engine alert

`getState();` return a `String` of the current state

`onStateChanged();` Called when the scanning state is changed

`setScanning(boolean)` Start or Stop scanning state

# Latest Version: 0.1.0
