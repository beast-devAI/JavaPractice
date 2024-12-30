package com.qa.advanced.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {

    public static void main(String[] args) {

        Set<String> stdInfo = new HashSet<String>();

        stdInfo.add("Mayank");
        stdInfo.add("Siddhu");
        stdInfo.add("Sheetal");
        stdInfo.add("Ibrahim");
        stdInfo.add("Harendra");
        stdInfo.add("Shradhha");

        Iterator itr = stdInfo.iterator();

        System.out.println(stdInfo);

        while (itr.hasNext()) {

            String str=itr.next().toString();

            if (str.contains("S")) {

                itr.remove();
                System.out.println("My name is: "+" "+ str);
            }
        }

        System.out.println(stdInfo);
    }
}
