package com.javarush.task.task18.task1805.Сортировка_байт.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameEnd = reader.readLine();
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1805/Сортировка_байт/vov/" + nameEnd + ".txt";

        Set<Integer> arr = new TreeSet();

        try (FileInputStream fis = new FileInputStream(fileName)) {
            while (fis.available() > 0) {
                arr.add(fis.read());
            }
        }


        // 8 букв + 1 пробел = 9 разных байтов
        for (Integer i : arr) {
            System.out.print(i + " ");
        }


    }
}
