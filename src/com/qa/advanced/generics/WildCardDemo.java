package com.qa.advanced.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WildCardDemo {

    public static void main(String[] args) {

        List<String> stdName = new ArrayList<String>();
        List<Number> stdMarks = new ArrayList<Number>();
        List<Boolean> stdPlacementStatus = new ArrayList<Boolean>();
        List<Integer> stdFee = new ArrayList<Integer>();
        List<Float> stdHeight = new ArrayList<Float>();

        stdName.add("Harendra");
        stdName.add("Sheetal");
        stdName.add("Mayank");
        stdName.add("Shraddha");
        stdName.add("Siddhu");
        stdName.add("Jyoti");

        stdMarks.add(95);
        stdMarks.add(98.75);
        stdMarks.add(96.67);
        stdMarks.add(95l);
        stdMarks.add(99.99923f);
        stdMarks.add(98);

        stdPlacementStatus.add(true);
        stdPlacementStatus.add(false);
        stdPlacementStatus.add(false);
        stdPlacementStatus.add(false);
        stdPlacementStatus.add(false);
        stdPlacementStatus.add(false);

        stdFee.add(20000);
        stdFee.add(21000);
        stdFee.add(40000);
        stdFee.add(30000);
        stdFee.add(41000);
        stdFee.add(35000);

        /*

        print_unbounded_WildCards(stdName);
        print_unbounded_WildCards(stdMarks);
        print_unbounded_WildCards(stdPlacementStatus);

         */
/*
        print_wildCard_UpperBound(stdMarks);
        print_wildCard_UpperBound(stdFee);
*/


        print_wildCard_LowerBound(stdMarks);
        print_wildCard_LowerBound(stdFee);
        // print_wildCard_LowerBound(stdHeight);

    }


    public static void print_unbounded_WildCards(List<?> l) {

        Iterator itr = l.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
        System.out.println();

    }

    public static void print_wildCard_UpperBound(List<? extends Number> l) {

        Iterator itr = l.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        System.out.println();
    }

    public static void print_wildCard_LowerBound(List<? super Integer> l) {

        Iterator itr = l.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        System.out.println();
    }


}
