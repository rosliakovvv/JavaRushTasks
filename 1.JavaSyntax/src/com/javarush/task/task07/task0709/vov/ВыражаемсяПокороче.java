package com.javarush.task.task07.task0709.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ВыражаемсяПокороче {
    public static List<String> sArr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            sArr.add(reader.readLine());

        }

        int minL = sArr.get(0).length();
        for (int i = 1; i < sArr.size(); i++) {
            if (minL > sArr.get(i).length()) {
                minL = sArr.get(i).length();
            }
        }

        for (int i = 0; i < sArr.size(); i++) {
            if (sArr.get(i).length() == minL) {
                System.out.println(sArr.get(i));
            }
        }
    }
}
