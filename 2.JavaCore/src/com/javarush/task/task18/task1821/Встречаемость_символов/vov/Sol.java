package com.javarush.task.task18.task1821.Встречаемость_символов.vov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        String file = "2.JavaCore/src/com/javarush/task/task18/task1821/Встречаемость_символов/vov/";
        int[] arr = new int[128];

        // FileReader читает символы, но возвращает то символьное значение в байтах
        try (FileReader fr = new FileReader(file + args[0])) {

            while (fr.ready()) {
                arr[fr.read()]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println((char)i + " " + arr[i]);
            }

        }
    }
}
