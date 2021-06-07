package com.javarush.task.task08.task0819.vov;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sol {
    public static void main(String[] args) {
        Set<Cat> myCats = createCats();
        myCats.remove(myCats.iterator().next());
        printCats(myCats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat.toString());
        }
    }

    public static class Cat {
    }
}
