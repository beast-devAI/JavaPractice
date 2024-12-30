package com.qa.advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    static String str;

    public static void main(String[] args) {


        HashMap<String, String> stdInfo = new HashMap<String, String>();

        stdInfo.put("name", "harendra");
        stdInfo.put("city", "Raya");
        stdInfo.put("company", "infi");
        stdInfo.put("student id", "DT001");
        stdInfo.put("course", "Java Full Stack by xyz");
        stdInfo.put("PlacementComp", null);
        stdInfo.put(null, null);

        HashMap<String, String> stdPercentage = new HashMap<String, String>();
        stdInfo.put("highSchool", "76");
        stdInfo.put("inter", "87");
        stdInfo.put("grad", "65");
        stdInfo.put("master", null);

        stdInfo.putAll(stdPercentage);

        System.out.println(stdInfo);


       /*
        System.out.println(stdInfo);
        System.out.println(stdInfo.size());

        System.out.println(stdInfo.get("company"));

        System.out.println(stdInfo.keySet());
        System.out.println(stdInfo.values());


        System.out.println(stdInfo.replace("name","sheetal"));
        System.out.println(stdInfo);


        */

/*
        System.out.println(stdInfo.containsKey("emp id"));
        System.out.println(stdInfo.containsValue("harendra"));
        System.out.println(stdInfo.entrySet());

 */

    }
}
