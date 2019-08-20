package com.example.androidmavensecondlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mavenlibbintrayrelease.AndroidUtilLib;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "AndroidUtilLib.getString() = " + AndroidUtilLib.getString());
        Log.d(TAG, "AndroidUtilLib.getString() version = " + AndroidUtilLib.getStringVersion());
    }
}
