package com.qa.advanced.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {

        NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();

        nmap.put(20, "Jyoti");
        nmap.put(10, "Rupam");
        nmap.put(3, "Sheetal");
        nmap.put(75, "Ankit");
        nmap.put(34, "Jaiswal");
        nmap.put(80, "Bishnu");
        nmap.put(37, "MSB");

        //{3=Sheetal, 10=Rupam, 20=Jyoti, 34=Jaiswal, 37=MSB, 75=Ankit, 80=Bishnu}



        System.out.println(nmap);
        System.out.println(nmap.ceilingEntry(50));
        System.out.println(nmap.ceilingKey(50));
        System.out.println(nmap.firstEntry());
        System.out.println(nmap.lastEntry());
        System.out.println(nmap.floorEntry(18));
        System.out.println(nmap.floorKey(10));
        System.out.println(nmap.higherEntry(10));
        System.out.println(nmap.higherKey(10));

        System.out.println(nmap.navigableKeySet());

        System.out.println(nmap.subMap(20,false,37,false));


    }

}
