package com.weekone.assignment4.producerconsumer;

import java.util.List;

/**
 * consumer remove resource from buffer
 */
public class Consumer implements Runnable{
    private List<Integer> buffer;
    private int size;

    public Consumer(List<Integer>buffer,int size){
        this.buffer = buffer;
        this.size = size;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this){
                //if buffer is empty wait
                while (buffer.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //remove first item from buffer
                int value = buffer.remove(0);
                System.out.println("consumed " +value);
                System.out.println("buffer : "+this.buffer);

                //notify producer
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
