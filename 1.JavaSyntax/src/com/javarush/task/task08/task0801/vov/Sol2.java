package com.javarush.task.task08.task0801.vov;

import java.util.HashSet;
import java.util.Set;

public class Sol2 {
    public static void main(String[] args) {
        Set<String> setV = new HashSet<>();
        setV.add("арбуз");
        setV.add("банан");
        setV.add("дыня");
        setV.add("груша");
        setV.add("ирис");

        // порядок будет другим
        for (String s: setV
             ) {
            System.out.println(s);
        }

    }

}
