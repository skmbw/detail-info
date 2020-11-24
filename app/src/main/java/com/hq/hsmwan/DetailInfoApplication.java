package com.hq.hsmwan;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class DetailInfoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
