package com.javarush.task.task18.task1808.Разделение_файла.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameEnd1 = reader.readLine();
        String nameEnd2 = reader.readLine();
        String nameEnd3 = reader.readLine();

        String fileName1 = "2.JavaCore/src/com/javarush/task/task18/task1808/Разделение_файла/vov/" + nameEnd1 + ".txt";
        String fileName2 = "2.JavaCore/src/com/javarush/task/task18/task1808/Разделение_файла/vov/" + nameEnd2 + ".txt";
        String fileName3 = "2.JavaCore/src/com/javarush/task/task18/task1808/Разделение_файла/vov/" + nameEnd3 + ".txt";

        try (FileInputStream fis = new FileInputStream(fileName1);
             FileOutputStream fos1 = new FileOutputStream(fileName2);
             FileOutputStream fos2 = new FileOutputStream(fileName3)) {

            // Если нечетное, то 1 мы выравниваем части, если четное то 1 не повиляет на рез деления, но второй половине достанется меньше, как по условию
            int halfOfFile = (fis.available() + 1) / 2;
            int numberOfByte = 0;

            while (fis.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fos1.write(fis.read());
                    numberOfByte++;
                } else {
                    fos2.write(fis.read());
                }
            }
        }
    }
}
