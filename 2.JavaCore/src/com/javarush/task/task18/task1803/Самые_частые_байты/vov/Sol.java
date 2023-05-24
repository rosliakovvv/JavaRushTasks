package com.javarush.task.task18.task1803.Самые_частые_байты.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String endName = reader.readLine();
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1803/Самые_частые_байты/vov/" + endName + ".txt";
        int[] allBytes = new int[256];

        try (FileInputStream fis = new FileInputStream(fileName)) {
            while (fis.available() > 0) {
                allBytes[fis.read()] += 1;
            }
        }

        int maxCount = 0;

        for (int allByte : allBytes) {
            if (allByte > maxCount) maxCount = allByte;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < allBytes.length; i++) {
            if (allBytes[i] == maxCount) res.add(i);
        }

        for (Integer r : res) {
            System.out.print(r + " ");
        }
            System.out.println("\n" + res.size());


    }
}
