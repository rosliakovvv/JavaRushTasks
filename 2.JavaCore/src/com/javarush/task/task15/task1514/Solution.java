package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "Vov");
        labels.put(2d, "Ivan");
        labels.put(3d, "Alex");
        labels.put(4d, "Rus");
        labels.put(5d, "Ant");
    }

    public static void main(String[] args) {
        System.out.println(labels);


    }
}
