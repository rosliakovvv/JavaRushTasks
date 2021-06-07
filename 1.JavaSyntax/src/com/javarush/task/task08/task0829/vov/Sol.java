package com.javarush.task.task08.task0829.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        System.out.println("Заполни список");

        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        System.out.println("Введите город:");
        System.out.println();
        String city = reader.readLine();

        if (list.contains(city)) {
            int item = list.indexOf(city);
            String familyName = list.get(item+1);
            System.out.println(familyName);
        } else System.out.println("Такого города нет");

    }
}
