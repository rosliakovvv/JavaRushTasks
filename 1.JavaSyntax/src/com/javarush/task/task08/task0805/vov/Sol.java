package com.javarush.task.task08.task0805.vov;

import java.util.HashMap;
import java.util.Map;

public class Sol {
    public static void main(String[] args) {
        Map<String, String> mapV = new HashMap<>();
        mapV.put("pim", "pam");
        mapV.put("puti", "pati");
        mapV.put("sikis", "nakis");

        printMapValue(mapV);


    }

    public static void printMapValue(Map<String, String> map) {
        for (Map.Entry<String, String> pair: map.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}
