package com.github.gcestaro;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    @Override
    public String toString() {
        return "i'm a thread-safe singleton";
    }
}
