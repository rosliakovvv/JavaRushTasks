package com.javarush.task.task08.task0823.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        // убираем множественные пробелы
        while (s.contains("  ")) {
            String res = s.replace("  ", " ");
            s = res;
        }

        String[] words = s.split(" ");

        for (String word : words) {
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1, words.length +1) + " ");
        }
    }
}

