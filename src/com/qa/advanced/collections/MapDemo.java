package com.qa.advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String,String> mapObj=new HashMap<String,String>();

        mapObj.put("name","jyoti");  // Entry
        mapObj.put("age","450");
        mapObj.put("instID","DT0098");
        mapObj.put("contact","1234567890");
        mapObj.put("Area","Phase 3");
        mapObj.put("City","East Delhi");

        System.out.println(mapObj);
        System.out.println(mapObj.get("Area"));
        System.out.println(mapObj.size());


    }

}
