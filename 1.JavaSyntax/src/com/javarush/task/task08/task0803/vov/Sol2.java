package com.javarush.task.task08.task0803.vov;

import java.util.HashMap;
import java.util.Map;

public class Sol2 {
    public static void main(String[] args) {

        String[] cats = new String[]{"Vasia", "Murka", "Chmo Loxmatoe"};

        Map<String, Cat> mapCat = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : mapCat.entrySet()
        ) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> mapT = new HashMap<>();

/*
        for (int i = 0; i < cats.length; i++) {
            mapT.put(cats[i], new Cat(cats[i]));
        }
*/

        // или

        for (String name : cats) {
            mapT.put(name, new Cat(name));
        }

        return mapT;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
