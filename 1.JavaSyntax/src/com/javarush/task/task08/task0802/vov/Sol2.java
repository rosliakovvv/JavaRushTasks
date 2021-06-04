package com.javarush.task.task08.task0802.vov;

import java.util.HashMap;
import java.util.Map;

public class Sol2 {
    public static void main(String[] args) {
        Map<String, String> mapV = new HashMap<>();

        mapV.put("арбуз", "ягода");
        mapV.put("дыня", "овощ");
        mapV.put("банан", "трава");

        for (Map.Entry<String, String> pair : mapV.entrySet()
        ) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }

}
