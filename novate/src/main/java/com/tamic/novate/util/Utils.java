package com.tamic.novate.util;

import android.os.Looper;

import okhttp3.RequestBody;

/**
 * copy  Copyright (C) 2007 The Guava Authors by from retrofit2
 *
 * @author Tamic(https://github.com/NeglectedByBoss)
 */
public class Utils {
    public static <T> T checkNotNull(T object, String message) {
        if (object == null) {
            throw new NullPointerException(message);
        }
        return object;
    }

    public static boolean checkMain() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static RequestBody createJson(String jsonString) {
        checkNotNull(jsonString, "json not null!");
        return RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), jsonString);
    }
}