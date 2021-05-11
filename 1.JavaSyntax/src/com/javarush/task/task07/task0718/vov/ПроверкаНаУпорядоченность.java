package com.javarush.task.task07.task0718.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ПроверкаНаУпорядоченность {
    public static void main(String[] args) throws IOException {
        List<String> wordList = new ArrayList<>();
        List<Integer> lengthWordList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            wordList.add(reader.readLine());
        }

        for (int i = 0; i < wordList.size(); i++) {
            lengthWordList.add(wordList.get(i).length());
        }

        for (int i = 0; i < lengthWordList.size(); i++) {
            if (lengthWordList.get(i) > lengthWordList.get(i + 1)) {
                System.out.println((i + 1) + " нарушил");
                break;
            }
        }
    }
}

