package com.javarush.task.task08.task0818.vov;

import java.util.HashMap;
import java.util.Map;

public class Sol {
    public static void main(String[] args) {
        Map<String, Integer> goodSalary = createMap();
        removeItemFromMap(goodSalary);

        for (Map.Entry<String, Integer> pair : goodSalary.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> createMap() {
        Map<String, Integer> salaryList = new HashMap<>();
        salaryList.put("Petrov", 55000);
        salaryList.put("Ivanov", 65000);
        salaryList.put("Guskov", 75000);
        salaryList.put("Sidorov", 85000);
        salaryList.put("Roslyakov", 95000);
        return salaryList;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copyMap = new HashMap<>(map);

        for (Map.Entry<String, Integer> pair : copyMap.entrySet()) {
            if (pair.getValue() < 70000) {
                map.remove(pair.getKey());
            }
        }
    }


}
