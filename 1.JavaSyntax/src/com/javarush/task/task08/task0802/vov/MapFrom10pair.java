package com.javarush.task.task08.task0802.vov;

import java.util.HashMap;
import java.util.Map;

public class MapFrom10pair {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");

        for (Map.Entry<String, String> pair : map.entrySet()
        ) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }



    }
}
