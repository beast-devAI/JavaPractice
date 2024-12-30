package com.qa.advanced.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue qu = new PriorityQueue<>();

        qu.add("Satyam");
        qu.add("Akash");
        qu.add("Vijay");
        qu.add("Pushpesh");
        qu.add("Sarvesh");
        qu.add("Jaiswal");
        qu.add("Sheetal");
        qu.add("Harendra");
        qu.add("Rupam");


        System.out.println(qu);
        System.out.println(qu.element());
        System.out.println(qu.peek());
        System.out.println(qu.poll());
        System.out.println(qu.offer("Jyoti"));
        System.out.println(qu);


    }
}
