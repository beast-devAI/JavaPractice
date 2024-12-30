package com.qa.advanced.collections;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

    public static void main(String[]args){

        System.out.println(new ComparatorDemo().compare("A","B"));

    }

    @Override
    public int  compare(Object o1, Object o2) {

        // custom compare method code here
        return 0;
    }
}
