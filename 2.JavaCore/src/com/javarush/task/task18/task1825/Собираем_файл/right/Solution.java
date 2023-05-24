package com.javarush.task.task18.task1825.Собираем_файл.right;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
Собираем файл
*/


public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<String> files = new TreeSet<>(new Comparator<String>() {

            // Здесь мы сортируем названия наших файлов по порядку.
            @Override
            public int compare(String o1, String o2) {
                String[] parts1 = o1.split(".part");
                String[] parts2 = o2.split(".part");
                int number1 = Integer.parseInt(parts1[parts1.length - 1]);
                int number2 = Integer.parseInt(parts2[parts2.length - 1]);
                return number1 - number2;
            }
        });

        String outputFile = null;
        String readString;

        while (!(readString = reader.readLine()).equals("end")) {

            files.add(readString);

            if (outputFile == null) {
                int indexOfSuffix = readString.lastIndexOf(".part");
                // Тут мы получим имя файла, без названия его части.
                outputFile = readString.substring(0, indexOfSuffix);
            }
        }

        if (outputFile == null) return;

        String fullOutputName = "2.JavaCore/src/com/javarush/task/task18/task1825/Собираем_файл/right/"+  outputFile + ".txt";
        try (FileOutputStream fileOutputStream = new FileOutputStream(fullOutputName)) {

            for (String file : files) {

                String fullInputName = "2.JavaCore/src/com/javarush/task/task18/task1825/Собираем_файл/right/"+  file + ".txt";
                try (FileInputStream fileInputStream = new FileInputStream(fullInputName)) {

                    byte[] buffer = new byte[fileInputStream.available()];

                    while (fileInputStream.available() > 0) {
                        // Это "порция" для записи, не что писать, а по сколько.
                        int bytesRead = fileInputStream.read(buffer);
                        fileOutputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
    }
}
