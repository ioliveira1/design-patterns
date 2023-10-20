package com.ioliveira.creational.singleton;

public class NonThreadSafeSingleton {

    private static NonThreadSafeSingleton instance;
    private String data;

    private NonThreadSafeSingleton(final String data) {
        this.data = data;
    }

    public static NonThreadSafeSingleton getInstance(final String data) {
        if (instance == null) {
            instance = new NonThreadSafeSingleton(data);
        }
        return instance;
    }
}
