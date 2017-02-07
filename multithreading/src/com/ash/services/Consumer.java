package com.ash.services;

import java.util.Queue;

/**
 * Created by ashokbance on 07/02/2017.
 */
public class Consumer extends Thread {

    private Queue<String> myQueue;
    volatile boolean interrupted;

    public Consumer(Queue<String> queue) {
        this.myQueue = queue;
    }

    @Override
    public void run() {


        //keep the try outside the while loop, otherwise it keeps catching and going round and round
        try {
            while (!interrupted) {
                synchronized (myQueue) {
                    if (myQueue.size() > 0) {
                        myQueue.remove();
                        System.out.println("removing element");
                        Thread.sleep(1000);
                        myQueue.notifyAll();
                    } else {
                        myQueue.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); //propagate the interruption
        }
    }


}
