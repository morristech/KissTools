/**
 *
 * Copyright (c) 2014 CoderKiss
 *
 * CoderKiss[AT]gmail.com
 *
 */

package com.kisstools;

import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;

import android.content.Context;

public class KissTools {
	public static final String TAG = "KissTools";
	private static WeakReference<Context> contextRef;

	public static void setContext(Context context) {
		if (context == null) {
			throw new InvalidParameterException("Invalid context parameter!");
		}

		Context appContext = context.getApplicationContext();
		contextRef = new WeakReference<Context>(appContext);
	}

	public static Context getApplicationContext() {
		Context context = contextRef.get();
		if (context == null) {
			throw new InvalidParameterException("Context parameter not set!");
		} else {
			return context;
		}
	}
}
