package com.javarush.task.task08.task0804.vov;

import java.util.HashMap;
import java.util.Map;

public class Sol {
    public static void main(String[] args) {
        Map<String, String> mapV = new HashMap<>();
        String[] keys = new String[]{"one", "two", "three"};
        String[] values = new String[]{"go", "to", "hui"};

        for (int i = 0; i < keys.length; i++) {
            mapV.put(keys[i], values[i]);
        }

        printKeys(mapV);
    }

    public static void printKeys(Map<String,String> mapT) {
        for (Map.Entry<String, String> pair: mapT.entrySet()
             ) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

}
