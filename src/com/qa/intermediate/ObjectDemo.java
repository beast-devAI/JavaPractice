package com.qa.intermediate;

public class ObjectDemo {

    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo();
        ObjectDemo obj2 = new ObjectDemo();
        String str=new String("abc");

        System.out.println(obj1.hashCode());
        System.out.println(obj2.getClass().getMethods().length);

        System.out.println(str.getClass().getMethods().length);


    }

    static {

        
    }
}
