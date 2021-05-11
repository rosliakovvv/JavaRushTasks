package com.javarush.task.task07.task0715.vov;

import java.util.ArrayList;
import java.util.List;

public class МытьРаму {
    public static void main(String[] args) {
        List<String> sArr = new ArrayList<>();
        String s = "именно";

        sArr.add("мама");
        sArr.add("мыла");
        sArr.add("раму");

        for (int i = 0; i < 5; i++) {
            sArr.add(i + 1, s);
            i++;    // надо добавлять шаг тк длина увеличивается
        }

        for (String i: sArr
             ) {
            System.out.println(i);
        }
    }
}
