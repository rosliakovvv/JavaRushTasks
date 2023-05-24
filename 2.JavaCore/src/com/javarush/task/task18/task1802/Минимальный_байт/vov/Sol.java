package com.javarush.task.task18.task1802.Минимальный_байт.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String minEnd = reader.readLine();
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1802/Минимальный_байт/vov/" + minEnd + ".txt";

        // Это значение будет в ответе, если файл пустой, но просто нудна проверка на пустоту файла и все.
        int minByte = Integer.MAX_VALUE; // Хотя достаточно 128 т.к. только положительные из 256

        try (FileInputStream fileInStream = new FileInputStream(fileName)) {
            while (fileInStream.available() > 0) {
                int curByte = fileInStream.read();
                if (curByte < minByte) minByte = curByte;
            }
        }
        System.out.println(minByte);
    }
}
