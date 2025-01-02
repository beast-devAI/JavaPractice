package com.qa.advanced.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> stdInfo = new ArrayList<String>();

        stdInfo.add("Harendra");
        stdInfo.add("Mayank");
        stdInfo.add("Sheetal");
        stdInfo.add("Shraddha");
        stdInfo.add("Siddhu");

        // System.out.println(stdInfo);

        ListIterator<String> ltr = stdInfo.listIterator();

        // forward Actions


        System.out.println(ltr.next());
        System.out.println(ltr.hasNext());

        System.out.println(ltr.next());
        System.out.println(ltr.hasNext());

        System.out.println(ltr.next());
        System.out.println(ltr.hasNext());

        System.out.println(ltr.next());
        System.out.println(ltr.hasNext());

        System.out.println(ltr.next());
        System.out.println(ltr.hasNext());




// Backward Actions

        System.out.println(ltr.previous());
        System.out.println(ltr.hasPrevious());
        System.out.println(ltr.previousIndex());

     /*
        System.out.println(ltr.previous());
        System.out.println(ltr.hasPrevious());

        System.out.println(ltr.previous());
        System.out.println(ltr.hasPrevious());

        System.out.println(ltr.previous());
        System.out.println(ltr.hasPrevious());

        System.out.println(ltr.previous());
        System.out.println(ltr.hasPrevious());


      */


    }


}
