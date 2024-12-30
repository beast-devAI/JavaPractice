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
        String courseFromFile=pr.getProperty("course");
        String cityFromFile=pr.getProperty("city");
        String durationFromFile=pr.getProperty("duration");
        String trainerFromFile=pr.getProperty("trainer");





        System.out.println(nameFromFile);
        System.out.println(courseFromFile);
        System.out.println(cityFromFile);
        System.out.println(durationFromFile);
        System.out.println(trainerFromFile);
    }
}
