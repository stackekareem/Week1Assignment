package com.weekone.assignment4;

/**
 * singleton with double lock prevention
 */
public class Singleton {
    private static volatile Singleton instance = null;
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Singleton(){

    }
}
