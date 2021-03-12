package com.weekone.assignment4.deadlock;

/**
 * thread two holding lock2 and wating to acuire lock1
 */
public class ThreadTwo implements Runnable{

    private String lock1;
    private String lock2;
    
    public ThreadTwo(String lock1, String lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized(lock2){
			System.out.println(Thread.currentThread().getName() + " holding " + lock2);
			System.out.println(Thread.currentThread().getName() + " wating " + lock1);
			synchronized(lock1){
				System.out.println(Thread.currentThread().getName() + " acquired "+lock1);
			}
		}
    }
}