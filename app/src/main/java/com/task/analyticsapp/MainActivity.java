package com.task.analyticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.amplifyframework.analytics.AnalyticsEvent;
import com.amplifyframework.core.Amplify;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        AnalyticsEvent event = AnalyticsEvent.builder()
//                .name("PasswordReset")
//                .addProperty("Channel", "SMS")
//                .addProperty("Successful", true)
//                .addProperty("ProcessDuration", 792)
//                .addProperty("UserAge", 120.3)
//                .build();
//
//        Amplify.Analytics.recordEvent(event);
    }
}