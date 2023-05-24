package com.javarush.task.task18.task1807.Подсчет_запятых.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameEnd = reader.readLine();
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1807/Подсчет_запятых/vov/" + nameEnd + ".txt";

        int commaCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            while (fis.available() > 0) {
                if (fis.read() == ',' ) commaCount++;
            }
        }

        System.out.println(commaCount);
    }
}
