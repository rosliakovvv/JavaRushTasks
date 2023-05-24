package com.javarush.task.task18.task1818.Два_в_одном.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String end1 = reader.readLine();
        String end2 = reader.readLine();
        String end3 = reader.readLine();

        String file1 = "2.JavaCore/src/com/javarush/task/task18/task1818/Два_в_одном/vov/" + end1 + ".txt";
        String file2 = "2.JavaCore/src/com/javarush/task/task18/task1818/Два_в_одном/vov/" + end2 + ".txt";
        String file3 = "2.JavaCore/src/com/javarush/task/task18/task1818/Два_в_одном/vov/" + end3 + ".txt";

        try (FileOutputStream fos = new FileOutputStream(file1);
             FileInputStream fis1 = new FileInputStream(file2);
             FileInputStream fis2 = new FileInputStream(file3)) {



            while (fis1.available() > 0) {
                fos.write(fis1.read());
            }

            while (fis2.available() > 0) {
                fos.write(fis2.read());
            }
        }
    }
}
