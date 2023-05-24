package com.javarush.task.task18.task1809.Реверс_файла.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String end1 = reader.readLine();
        String end2 = reader.readLine();

        String fileName1 = "2.JavaCore/src/com/javarush/task/task18/task1809/Реверс_файла/vov/" + end1 + ".txt";
        String fileName2 = "2.JavaCore/src/com/javarush/task/task18/task1809/Реверс_файла/vov/" + end2 + ".txt";

        ArrayList<Integer> arr = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(fileName1);
             FileOutputStream fos = new FileOutputStream(fileName2)) {

            if (fis.available() > 0) {
                while (fis.available() > 0) {
                    arr.add(fis.read());
                }
            }

            Collections.reverse(arr);

            for (Integer i : arr) {
                fos.write(i);
            }
        }
    }
}
