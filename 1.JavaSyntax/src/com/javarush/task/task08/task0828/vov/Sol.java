package com.javarush.task.task08.task0828.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите месяц");
        String month = reader.readLine();

        Map<String, Integer> monthOfYear = new HashMap<>();
        monthOfYear.put("Январь", 1);
        monthOfYear.put("Февраль", 2);
        monthOfYear.put("Март", 3);
        monthOfYear.put("Апрель", 4);
        monthOfYear.put("Май", 5);
        monthOfYear.put("Июнь", 6);
        monthOfYear.put("Июль", 7);
        monthOfYear.put("Август", 8);
        monthOfYear.put("Сентябрь", 9);
        monthOfYear.put("Октябрь", 10);
        monthOfYear.put("Ноябрь", 11);
        monthOfYear.put("Декабрь", 12);

        for (Map.Entry<String, Integer> pair : monthOfYear.entrySet()) {
            if (pair.getKey().equals(month)) {
                System.out.println(pair.getKey() + " is the " + pair.getValue() + " mouth");
            }
        }



    }





}
