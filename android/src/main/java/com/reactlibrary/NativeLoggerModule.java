package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.util.Log;

public class NativeLoggerModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public NativeLoggerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "NativeLogger";
    }

    @ReactMethod
    public void log(String prefix, String message) {
        Log.i(prefix, message);
    }
}
