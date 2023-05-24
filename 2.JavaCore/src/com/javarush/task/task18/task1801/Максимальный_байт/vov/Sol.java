package com.javarush.task.task18.task1801.Максимальный_байт.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader readerV = new BufferedReader(new InputStreamReader(System.in));

        String maxEnd = readerV.readLine();
        // Есть разница а числовых значениях символов разного регистра.
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1801/Максимальный_байт/vov/" + maxEnd + ".txt";
        int maxByte = 0;

        try (FileInputStream fileInStream = new FileInputStream(fileName)) {
            while (fileInStream.available() > 0) {
                int curByte = fileInStream.read();
                if (curByte > maxByte) maxByte = curByte;
            }
        }
        System.out.println(maxByte);
    }
}
