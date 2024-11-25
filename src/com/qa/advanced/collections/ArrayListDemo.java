package com.qa.advanced.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        System.out.println(al.size());

        String str = new String("Demo");
        ArrayListDemo objAl = new ArrayListDemo();
        Thread th = new Thread();
        Object obj = new Object();

        al.add(str);
        al.add(objAl);
        al.add(th);
        al.add(obj);
        al.add(null);


        System.out.println(al.size());
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.get(3));
        System.out.println(al.get(4));

        System.out.println(al);

        System.out.println("Object removed: " + "" + al.remove(1));

        System.out.println(al);


    }

}
