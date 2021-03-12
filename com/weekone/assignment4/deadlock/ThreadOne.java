package com.weekone.assignment4.deadlock;

/**
 * thread one holding lock1 and wating to acuire lock2
 */
public class ThreadOne implements Runnable{

    private String lock1;
    private String lock2;
    
    public ThreadOne(String lock1, String lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized(lock1){
			System.out.println(Thread.currentThread().getName() + " holding " + lock1);
			System.out.println(Thread.currentThread().getName() + " wating " + lock2);
			synchronized(lock2){
				System.out.println(Thread.currentThread().getName() + " acquired "+lock2);
			}
		}
    }
}
