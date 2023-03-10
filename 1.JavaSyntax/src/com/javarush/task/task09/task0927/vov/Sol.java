package com.javarush.task.task09.task0927.vov;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sol {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>();
        cats.put("vasika", new Cat("Vasika"));
        cats.put("muska", new Cat("Muska"));
        cats.put("murka", new Cat("Murka"));
        cats.put("barsik", new Cat("Barsik"));
        cats.put("pushit", new Cat("Pushit"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> setCats = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            setCats.add(pair.getValue());
        }
        return setCats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat - " + this.name;
        }
    }
}
