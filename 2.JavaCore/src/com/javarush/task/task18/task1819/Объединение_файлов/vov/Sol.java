package com.javarush.task.task18.task1819.Объединение_файлов.vov;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String end1 = reader.readLine();
        String end2 = reader.readLine();

        String file1 = "2.JavaCore/src/com/javarush/task/task18/task1819/Объединение_файлов/vov/" + end1 + ".txt";
        String file2 = "2.JavaCore/src/com/javarush/task/task18/task1819/Объединение_файлов/vov/" + end2 + ".txt";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            while (fis2.available() > 0) {
                baos.write(fis2.read());
            }

            while (fis1.available() > 0) {
                baos.write(fis1.read());
            }

            // Если открыть этот поток раньше, то наверно получается конфликт двух потоков на одном файле?
            // Поэтому сначала надо закрыть один ,а потом открыть другой.

            try (FileOutputStream fos = new FileOutputStream(file1)) {
                baos.writeTo(fos);
            }
        }
    }
}
