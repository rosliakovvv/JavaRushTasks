package com.javarush.task.task08.task0814.vov;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sol3 {
    public static void main(String[] args) {
        Set<Integer> resSet;

        resSet = createSet();
        removeAllNumGreaterThen10(resSet);

        for (Integer el : resSet) {
            System.out.println(el);
        }

        resSet = createSet();
        removeWithoutIterator(resSet);

        for (Integer el : resSet) {
            System.out.println(el);
        }

    }

    public static Set<Integer> createSet() {
        Set<Integer> set5 = new HashSet<>();
        set5.add(10);
        set5.add(20);
        set5.add(30);
        set5.add(40);
        set5.add(50);
        return set5;
    }

    public static Set<Integer> removeAllNumGreaterThen10(Set<Integer> set) {

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int el = iterator.next();
            if (el > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static Set<Integer> removeWithoutIterator(Set<Integer> set) {
        Set<Integer> copySet = new HashSet<>(set);
        for (Integer i : copySet) {
            if (i > 20) {
                set.remove(i);
            }
        }
        return set;
    }
}
