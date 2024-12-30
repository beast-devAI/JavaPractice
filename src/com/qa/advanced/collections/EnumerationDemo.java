package com.qa.advanced.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {


    public static void main(String[] args) {

        Vector<String> stdInfo = new Vector<String>();

        stdInfo.addElement("Harendara");
        stdInfo.addElement("Siddhu");
        stdInfo.addElement("Muskan");
        stdInfo.addElement("Manu");
        stdInfo.addElement("Guddu");

        Enumeration er = stdInfo.elements();

        while (er.hasMoreElements()) {

            System.out.println(er.nextElement());

        }


    }


}
