package com.javarush.task.task08.task0817.vov;

import java.util.*;


public class Sol {
    public static void main(String[] args) {

        Map<String, String> list = createMap();

        removeTheFirstNameDuplicates(list);

        for (String value : list.values()) {
            System.out.println(value);
        }


    }

    public static Map<String, String> createMap() {
        Map<String, String> names = new HashMap<>();
        names.put("Petrov", "Vasia");
        names.put("Vasin", "Vasia");
        names.put("Klimova", "Masha");
        names.put("Roslyakov", "Vov");
        names.put("Vorobei", "Jack");
        return names;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);

        for (String nameExem : copy.values()) {
            int count = 0; // будет мин одно совпадение
            for (String nameCurr : copy.values()) {
                if (nameCurr.equals(nameExem)) {
                    count ++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, nameExem);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
}
