package com.javarush.task.task08.task0814.vov;

import java.util.HashSet;
import java.util.Set;

public class Sol {
    public static void main(String[] args) {
        Set<Integer> tenNum = removeAllNumCreateThenTen(createSet());

        for (Integer i: tenNum
             ) {
            System.out.println(i);
        }
    }

    public static Set<Integer> createSet() {
        Set<Integer> twentyNum = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            twentyNum.add(i);
        }
        return twentyNum;
    }

    public static Set<Integer> removeAllNumCreateThenTen(Set<Integer> setT) {
        setT.removeIf(i -> i > 10);
        return setT;
    }

}
