package com.qa.advanced.generics;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {

    public static void main(String[] args) {

        // GenericExample<String> genExString=new GenericExample<String>();

        //  GenericExample<Thread> genExIhread=new GenericExample<Thread>();

        // GenericExample<File> genExFile=new GenericExample<File>();

        GenericExample<Number> genExNumber = new GenericExample<Number>();
        //  GenericExample<Integer> genExInteger = new GenericExample<Integer>();
        //  GenericExample<Float> genExFloat = new GenericExample<Float>();


        //  genExString.add("Harendra");
        //  System.out.println(genExString.getInfo("Harendra"));


        //  genExIhread.add(new Thread());
        //  System.out.println(genExIhread.getInfo(new Thread()));

        //  genExFile.add(new File("abc"));
        //  System.out.println(genExFile.getInfo(new File("resources/DemoPropertyFile.properties")));

        genExNumber.add(10);
        System.out.println(genExNumber.getInfo(10));


    }
}
