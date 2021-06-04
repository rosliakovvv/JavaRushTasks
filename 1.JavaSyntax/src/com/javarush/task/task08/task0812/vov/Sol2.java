package com.javarush.task.task08.task0812.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol2 {
    public static void main(String[] args) throws IOException {
        List<Integer> numList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            numList.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1; // в одном экземпляре этот элемент уже есть
        int countMax = 0; // нужен для сохр макс варианта

        for (int i = 0; i < numList.size() - 1; i++) {
            if (numList.get(i).equals(numList.get(i + 1))) {
                count++;
                if (count > countMax) {
                    countMax = count;
                }
            } else count = 1; // надо сбросить
        }

        System.out.println(countMax); // выведится ноль если повторов не было
    }
}
