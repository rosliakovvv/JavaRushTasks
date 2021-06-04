package com.javarush.task.task08.task0805.vov;

import java.util.HashMap;
import java.util.Map;

public class Sol2 {
    public static void main(String[] args) {

        Map<String, String> mapV = new HashMap<>();

        mapV.put("он", "козел");
        mapV.put("она", "коза");
        mapV.put("оно", "петров");

        printMap(mapV);


    }

    public static void printMap(Map<String, String> mapT) {
        for (Map.Entry<String, String> pair : mapT.entrySet()) {
            System.out.println(pair.getValue().toUpperCase());
        }
    }
}
