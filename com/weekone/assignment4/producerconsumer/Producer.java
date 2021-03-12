package com.weekone.assignment4.producerconsumer;

import java.util.List;

/**
 * producer add resource to buffer
 */
public class Producer implements Runnable{
    private List<Integer> buffer;
    private int size;

    public Producer(List<Integer>buffer,int size){
        this.buffer = buffer;
        this.size = size;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this){
                //if buffer is full wait
                if (buffer.size() == size) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //adds item to buffer
                int value = buffer.size();
                buffer.add(value);
                System.out.println("produced :"+value);
                System.out.println("buffer : "+this.buffer);

                //notify
                notify();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
