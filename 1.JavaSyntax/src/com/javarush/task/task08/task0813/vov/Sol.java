package com.javarush.task.task08.task0813.vov;

import java.util.HashSet;
import java.util.Set;

public class Sol {
    public static void main(String[] args) {
    }

    public static Set<String> createSet() {
        Set<String> wordsOnL = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            wordsOnL.add("Love");
        }
        return wordsOnL;
    }

}
