package com.qa.advanced.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[]args) throws IOException {

        Properties pr=new Properties();
        pr.load(new FileInputStream(new File("resources/DemoPropertyFile.properties")));

        String nameFromFile=pr.getProperty("name");
        String stdIDFromFile=pr.getProperty("stdid");
        String cityFromFile=pr.getProperty("city");
        String ageFromFile=pr.getProperty("age");
        String mobileNumFromFile=pr.getProperty("mobileNum");




        System.out.println(nameFromFile);
        System.out.println(stdIDFromFile);
        System.out.println(cityFromFile);
        System.out.println(ageFromFile);
        System.out.println(mobileNumFromFile);
    }
}
