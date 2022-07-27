package com.kiellenaidu.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AccuWeatherURL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        URL accuWeatherURL = NetworkUtil.BuildURL();
        Log.i(TAG, " On Create: " + accuWeatherURL);
    }
}