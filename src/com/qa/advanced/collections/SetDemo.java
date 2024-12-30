package com.qa.advanced.collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<String> stObj = new HashSet<>();

        stObj.add("a");
        stObj.add("b");
        stObj.add("c");
        stObj.add("d");
        stObj.add("e");
        stObj.add("f");
        stObj.add("g");
        stObj.add("h");
        stObj.add("I");
        stObj.add("J");
        stObj.add("K");
        stObj.add("L");
        stObj.add("M");
        stObj.add("N");
        stObj.add("O");
        stObj.add("P");


        System.out.println(stObj);
        System.out.println(stObj.size());

        stObj.add("test");

        System.out.println(stObj);
        System.out.println(stObj.size());


    }

}
