package com.javarush.task.task08.task0814.vov;

import java.util.HashSet;
import java.util.Set;

public class Sol2 {
    public static void main(String[] args) {
        Set<Integer> tenNumSet = removeAllNumMoreTen(createSet());

        for (Integer item : tenNumSet
        ) {
            System.out.println(item);
        }
    }

    public static Set<Integer> createSet() {
        Set<Integer> twentyNumSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            twentyNumSet.add(i);
        }
        return twentyNumSet;
    }

    public static Set<Integer> removeAllNumMoreTen(Set<Integer> setT) {
        // это кодхак такой, создать копию списка чтобы использовать ее для проходения по списку
        // и одновременно изменять список, иначе он будет менять и цикл не будет работать

        Set<Integer> copy = new HashSet<>(setT);

        for (Integer item : copy
        ) {
            if (item > 10) {
                setT.remove(item);
            }
        }
        return setT;
    }

}
