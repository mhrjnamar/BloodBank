package com.android.iunoob.bloodbank;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class BloodBank extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(BloodBank.this);
    }
}
