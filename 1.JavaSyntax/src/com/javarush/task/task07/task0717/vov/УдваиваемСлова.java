package com.javarush.task.task07.task0717.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class УдваиваемСлова {
    public static List<String> wordList;
    public static void main(String[] args) throws IOException {
        wordList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            wordList.add(reader.readLine());
        }

        doubleValues(wordList);

        for (String s: wordList
             ) {
            System.out.println(s);
        }


    }

    public static List<String> doubleValues(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i++));
        }
        return list;
    }
}
