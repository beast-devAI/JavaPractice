package com.qa.intermediate;

public class StringDemo {

    public static void main (String[]args) {

        String s1=new String();
        String s2=new String("Vijay Narayan Chaube Chaube");


        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s2.charAt(6));
        System.out.println(s2.concat("Varanasi"));
        System.out.println(s2.contains("guddu"));
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        System.out.println(s2.lastIndexOf("ube"));

       System.out.println(s2.length());

        System.out.println(s2.replace("ube","Dhary"));



    }
}
