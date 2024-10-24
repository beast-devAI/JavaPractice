package com.qa.advanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

    final static String configFilePath = "src/config.properties"; // path as per project hierarchy

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(new File(configFilePath));

        Properties pr = new Properties();

        pr.load(fis); // loading the property file instance through FileInputStream

        String applicationURL = pr.getProperty("appURL"); // getting property as per the keys defined in file
        String browserName = pr.getProperty("browser");
        String envDetail = pr.getProperty("Env");
        String applicationUserName = pr.getProperty("appUserName");
        String applicationPassword = pr.getProperty("appPassword");

        System.out.println(applicationURL); // Printing the corresponding value of a key to the console
        System.out.println(browserName);
        System.out.println(envDetail);
        System.out.println(applicationUserName);
        System.out.println(applicationPassword);


    }


}
