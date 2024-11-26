package com.qa.advanced.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> stObj = new HashSet<String>();

        stObj.add("Rupam");
        stObj.add("Jyoti");
        stObj.add("Harendra");
        stObj.add("Pushpesh");
        stObj.add("Sheetal");
        stObj.add("Harendra");
        stObj.add("Pushpesh");
        stObj.add("Sheetal");

       System.out.println(stObj);
        System.out.println(stObj.size());




    }

}
