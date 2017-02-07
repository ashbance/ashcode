package com.ash.services;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ashokbance on 07/02/2017.
 */
public class Data {

    private static final Queue<String> queue = new LinkedList<>();

    public static synchronized Queue<String> getQueue() {
        return queue;
    }


}
