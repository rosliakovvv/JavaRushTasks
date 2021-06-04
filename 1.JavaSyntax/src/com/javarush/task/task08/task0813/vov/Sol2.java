package com.javarush.task.task08.task0813.vov;

import java.util.HashSet;
import java.util.Set;

public class Sol2 {
    public static void main(String[] args) {
    }

    public static Set<String> createSet() {
        Set<String> tenWords = new HashSet<>();

        tenWords.add("люблю");
        tenWords.add("люблю");
        tenWords.add("люблю");
        tenWords.add("люблю");
        tenWords.add("люблю");
        return tenWords;
    }
}
