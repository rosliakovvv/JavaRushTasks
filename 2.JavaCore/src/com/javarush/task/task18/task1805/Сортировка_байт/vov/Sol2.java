package com.javarush.task.task18.task1805.Сортировка_байт.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sol2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameEnd = reader.readLine();
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1805/Сортировка_байт/vov/" + nameEnd + ".txt";

        int[] arr = new int[256];

        try (FileInputStream fis = new FileInputStream(fileName)) {
            while (fis.available() > 0) {
                arr[fis.read()]++;
            }
        }

        ArrayList<Integer> byteList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) byteList.add(i);
        }

        Collections.sort(byteList);

        for (Integer b : byteList) {
            System.out.println(b + " ");
        }
    }
}




