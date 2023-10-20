package com.ioliveira.creational.singleton;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;
    private String data;

    private ThreadSafeSingleton(final String data) {
        this.data = data;
    }

    public static ThreadSafeSingleton getInstance(final String data) {

        ThreadSafeSingleton result = instance;
        if (result == null) {
            synchronized (ThreadSafeSingleton.class) {
                result = instance;
                if (result == null) {
                    instance = new ThreadSafeSingleton(data);
                }
            }
        }
        return result;
    }
}
