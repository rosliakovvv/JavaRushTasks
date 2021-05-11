package com.javarush.task.task07.task0717.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class УдваиваемСловаНорм {
    public static List<String> wordList;
    public static ArrayList<String> resList;

    public static void main(String[] args) throws IOException {
        wordList = new ArrayList<>();
        resList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {
            wordList.add(reader.readLine());
        }

        doubleValues(wordList);

        for (String s : resList
        ) {
            System.out.println(s);
        }
    }



    public static List<String> doubleValues(List<String> list) {



        for (String s : list
        ) {
            resList.add(s);
            resList.add(s);
        }

        return resList;
    }
}
