package com.javarush.task.task07.task0718.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ПроверкаНаУпорядоченностьНорм {

    public static void main(String[] args) throws IOException {
        List<String> wordList2 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            wordList2.add(reader.readLine());
        }

        String s = wordList2.get(0);


        for (int i = 1; i < wordList2.size(); i++) {
            if (wordList2.get(i).length() >= s.length()) {
                s = wordList2.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}
