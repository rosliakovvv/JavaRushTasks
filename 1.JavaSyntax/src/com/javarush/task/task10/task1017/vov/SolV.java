package com.javarush.task.task10.task1017.vov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SolV {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        //напишите тут ваш код
        int res = defaultValue;

        try {
            if (index < list.size() + 1) {
                return list.get(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return defaultValue;
        }
        return defaultValue;
    }
}
