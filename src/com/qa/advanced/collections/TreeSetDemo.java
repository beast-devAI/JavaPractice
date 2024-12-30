package com.qa.advanced.collections;

import java.util.TreeSet;

public class TreeSetDemo implements Comparable{

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

// non comparable objects
        ts.add(new Thread());
        ts.add(new Thread());
        ts.add(new Thread());


        System.out.println(ts);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
