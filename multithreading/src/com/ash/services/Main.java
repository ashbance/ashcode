package com.ash.services;

/**
 * Created by ashokbance on 07/02/2017.
 */
public class Main {

    public static void main(String[] args) {

        //using a functional interface to create a thread.
        new Thread(()-> {
            for (int i =0; i<10; i++) {
                System.out.println(i);
            }
        }).start();

        Producer p = new Producer(Data.getQueue());
        p.start();

        Consumer c = new Consumer(Data.getQueue());
        c.start();

        p.stopThread();

        if (p.isInterrupted()) {
            System.out.println("Producer with interrupted saya Main method");
        }


    }


}
