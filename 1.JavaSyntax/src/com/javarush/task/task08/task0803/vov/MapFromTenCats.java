package com.javarush.task.task08.task0803.vov;

import java.util.HashMap;
import java.util.Map;

public class MapFromTenCats {
    public static void main(String[] args) {
        String[] cats = new String[]{"Musia", "Vasia", "Murzik", "Murka", "Tisha"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()
        ) {
            String name = pair.getKey();
            Cat cat = pair.getValue();
            System.out.println(name + " - " + cat);
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
        }
        return map;
    }



    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null; // если имя есть. то написать его заглавными, если нет то вернуть ноль
        }
    }
}
