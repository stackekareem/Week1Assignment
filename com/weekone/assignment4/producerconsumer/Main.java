package com.weekone.assignment4.producerconsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * main
 */
public class Main {
    public static void main(String[] args){
        try {
            int capacity = 2;
            List<Integer> buffer = new ArrayList<>();
            Thread threadone = new Thread( new Producer(buffer,capacity));
            Thread threadtwo = new Thread( new Consumer(buffer,capacity));

            threadone.start();
            threadtwo.start();

            threadone.join();
            threadtwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
