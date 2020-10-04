package com.gacrnd.gcs.binder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 此so库是有问题的
 */
public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        writeTest();
        readTest();
    }

    public native void writeTest();

    public native void readTest();
}
