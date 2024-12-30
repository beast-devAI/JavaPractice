package com.qa.advanced.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[]args){

        SortedMap sortedMap=new TreeMap();

        sortedMap.put("6","abc");
        sortedMap.put("4","pqr");
        sortedMap.put("7","xyz");
        sortedMap.put("2","behat");
        sortedMap.put("9","USA");

        System.out.println(sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.firstEntry());
        System.out.println(sortedMap.lastEntry());
        System.out.println(sortedMap.pollFirstEntry());
        System.out.println(sortedMap);
        System.out.println(sortedMap.pollLastEntry());
        System.out.println(sortedMap);






    }
}
