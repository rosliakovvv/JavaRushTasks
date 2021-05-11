package com.javarush.task.task08.task0806.vov;

import java.util.HashMap;
import java.util.Map;

public class Sol {
    public static void main(String[] args) {
        Map<String, Object> mapObj = new HashMap<>();

        mapObj.put("fuck", 0.5);
        mapObj.put("my", 5.5);
        mapObj.put("dick", null);
        mapObj.put("fat", "4");
        mapObj.put("suka", "go to");
        mapObj.put("yes", false);

        for (Map.Entry<String, Object> pair : mapObj.entrySet()
        ) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


}
