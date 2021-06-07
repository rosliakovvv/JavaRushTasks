package com.javarush.task.task08.task0821.vov;

import java.util.HashMap;
import java.util.Map;

public class Sol {
    public static void main(String[] args) {
        printPeopleMap(createPeopleMap());
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Petrov", "Oleg");
        map.put("Ivanov", "Petr");
        map.put("Petrov", "Svinia");
        map.put("Ivanov", "Petro");
        map.put("Petrov", "Chushka");
        map.put("Minin", "Sergey");
        map.put("Minin", "Sergo");
        map.put("Minin", "Pes");
        map.put("Minin", "Dirik");
        map.put("Putin", "Lox");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()
        ) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
