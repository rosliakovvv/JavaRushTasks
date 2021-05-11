package com.javarush.task.task07.task0722.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ЭтоКонец {

    public static void main(String[] args) throws IOException {
        List<String> wordList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = reader.readLine();
            if (s.equals("end"))
                break;
            else {
                wordList.add(s);
            }
        }

        // This is end
        for (String s: wordList
             ) {
            System.out.println(s);
        }
    }
}
