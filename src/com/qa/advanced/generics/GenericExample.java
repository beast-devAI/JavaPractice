package com.qa.advanced.generics;

import java.io.File;
import java.util.ArrayList;

public class GenericExample <T extends Number> {

    public void add(T obj) {

        System.out.println("The added object is " + obj.getClass().getName());

    }

    public T getInfo(T value) {

        return value;
    }


}
