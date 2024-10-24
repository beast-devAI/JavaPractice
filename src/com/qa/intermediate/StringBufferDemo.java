package com.qa.intermediate;

import java.awt.*;

public class StringBufferDemo {


    public static void main (String [] args) {

       StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer("Vijay Narayan Babu ji Chaubey Chaubey");


       StringBuffer s3 = s2.append(true);

       System.out.println(s2);

        System.out.println(s3);

        String s4=  s2.substring(4);
        System.out.println(s4);

         s2.reverse();
        System.out.println(s2);



    }

}
