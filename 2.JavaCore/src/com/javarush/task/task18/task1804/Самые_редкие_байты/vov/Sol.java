package com.javarush.task.task18.task1804.Самые_редкие_байты.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String endName = reader.readLine();
        String fileNme = "2.JavaCore/src/com/javarush/task/task18/task1804/Самые_редкие_байты/vov/" + endName + ".txt";
        int[] allBytes = new int[256];

        try (FileInputStream fis = new FileInputStream(fileNme)) {
            while (fis.available() > 0) {
                allBytes[fis.read()] += 1;
            }
        }

        int minCount = 256;

        for (int aByte : allBytes) {
            if (aByte < minCount & aByte != 0) minCount = aByte;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < allBytes.length; i++) {
            if (allBytes[i] == minCount) result.add(i);
        }

        for (Integer r : result) {
            System.out.print(r + " ");
        }

        System.out.println("\n" + result.size());
    }
}
