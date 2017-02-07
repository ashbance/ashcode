package com.ash.services;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ashokbance on 07/02/2017.
 */
public class Producer extends Thread {

    Queue<String> myQueue;
    AtomicInteger count = new AtomicInteger();
    volatile boolean interrupted;

    public Producer(Queue<String> queue) {
        myQueue = queue;
    }


    @Override
    public void run() {

        try{
            synchronized (myQueue) {

                while(!interrupted) {
                    if (myQueue.size() == 0) {
                        myQueue.add("new item" + count.incrementAndGet());
                        System.out.println("added item to queue " + myQueue.peek());

                        Thread.sleep(2000);
                        myQueue.notifyAll();
                    } else {
                        myQueue.wait();
                    }

                }
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted");
            Thread.currentThread().interrupt();
        }


    }

    public void stopThread() {
        interrupt();
    }

}
