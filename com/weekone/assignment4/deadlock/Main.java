package com.weekone.assignment4.deadlock;
/**
 * main
 */
public class Main {
    public static void main(String[] args){
        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread threadone = new Thread(new ThreadOne(lock1, lock2));
        Thread threadtwo = new Thread(new ThreadTwo(lock1, lock2));
        threadone.start();
        threadtwo.start();
    }   
}
