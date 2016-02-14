package com.javalj.kotlinapp;

import android.app.Application;

/**
 * Created by lijie on 2016/2/11.
 */
public class MyApplication extends Application {

    public MyApplication getInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        getInstance = this;
    }
}
