package com.javarush.task.task18.task1808.Разделение_файла.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// Для тренировки
public class Sol2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String end1 = reader.readLine();
        String end2 = reader.readLine();
        String end3 = reader.readLine();

        String file1 = "2.JavaCore/src/com/javarush/task/task18/task1808/Разделение_файла/vov/f" + end1 + ".txt";
        String file2 = "2.JavaCore/src/com/javarush/task/task18/task1808/Разделение_файла/vov/f" + end2 + ".txt";
        String file3 = "2.JavaCore/src/com/javarush/task/task18/task1808/Разделение_файла/vov/f" + end3 + ".txt";

        try (FileInputStream fis = new FileInputStream(file1);
             FileOutputStream fos1 = new FileOutputStream(file2);
             FileOutputStream fos2 = new FileOutputStream(file3)) {

            int halfOfFile = (fis.available() + 1) / 2;
            int numberOfBytes = 0;

            while (fis.available() > 0) {
                if (numberOfBytes < halfOfFile) {
                    fos1.write(fis.read());
                    numberOfBytes++;
                } else {
                    fos2.write(fis.read());
                }
            }
        }
    }
}
