package com.superflashlight.app;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
	private static Context context;
	
	public void onCreate() {
		context = getApplicationContext();
	}
	
	public static Context getContext() {
		return context;
	}
}
