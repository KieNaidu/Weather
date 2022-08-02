package com.kiellenaidu.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AccuWeatherURL";
    FiveDayWeather FiveDayWeather;
    TideFragment tideFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FiveDayWeather = new FiveDayWeather();
        tideFragment = new TideFragment();

        URL accuWeatherURL = NetworkUtil.BuildURL();
        Log.i(TAG, " On Create: " + accuWeatherURL);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.weather_frame, FiveDayWeather);
        transaction.replace(R.id.tide_frame,tideFragment);
        transaction.commit();

    }
}