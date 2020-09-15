package com.example.test_crash;


import android.os.Bundle;

import com.example.A;

import io.flutter.app.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {


    static {
        System.loadLibrary("hello-jni");
    }

    int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GeneratedPluginRegistrant.registerWith(new FlutterEngine(this));
        // int e = 1 / 0;
        new MethodChannel(getFlutterView(), "test").setMethodCallHandler((call, result) -> {
            A a = new A();
            a.stringFromJNI();
            result.success("222");
        });
    }
}
