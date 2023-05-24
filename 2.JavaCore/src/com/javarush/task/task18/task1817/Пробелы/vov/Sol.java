package com.javarush.task.task18.task1817.Пробелы.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        double charCount = 0;
        double spaceCount = 0;
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1817/Пробелы/vov/";

        try (FileInputStream fis = new FileInputStream(fileName + args[0])) {
            while (fis.available() > 0) {
                charCount++;
                if (fis.read() == 32) {
                    spaceCount++;
                }
            }

            // Русские буквы кодируются 2 байтами поэтмоу символов будет больше, чем написанно.
            double res = (spaceCount / charCount) * 100 / 2;
            System.out.println(String.format("%.2f", res));


//            System.out.println("Пробелов: " + spaceCount);
//            System.out.println("Всего символов: " + charCount);
        }
    }
}
