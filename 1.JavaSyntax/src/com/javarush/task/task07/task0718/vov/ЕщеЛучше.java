package com.javarush.task.task07.task0718.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ЕщеЛучше {

    public static void main(String[] args) throws IOException {
        List<String> wordList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            wordList.add(reader.readLine());
        }

        for (int i = 0; i < wordList.size()-1; i++) {
            int a = i + 1;
            if (wordList.get(i).length() <= wordList.get(a).length()) {
                continue;
            }

            if (wordList.get(i).length() > wordList.get(a).length()) {
                System.out.println(a);
                break;
            }
        }



        }


        }
