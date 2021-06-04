package com.javarush.task.task08.task0815.vov;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sol {
    public static void main(String[] args) {
        System.out.println(getCountSameFirstName(createMap(), "Petrov"));
        System.out.println(getCountSameLastName(createMap(), "Suka"));
    }

    public static Map<String, String> createMap() {
        Map<String, String> mapName = new HashMap<>();
        mapName.put("Petrov", "Suka");
        mapName.put("Sidorov", "Suka");
        mapName.put("Ivanov", "Suka");
        mapName.put("Kozlov", "Suka");
        mapName.put("Masha", "Suka");
        return mapName;
    }

    public static int getCountSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String s : map.keySet()) {
            if (s.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(lastName)) {
                count++;
            }
        }
        return count;
    }
}
