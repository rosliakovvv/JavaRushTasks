package com.javarush.task.task07.task0711.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class УдалитьВставить {
    public static void main(String[] args) throws IOException {
        List<String> sArr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            sArr.add(reader.readLine());
        }

        for (int i = 0; i < 2; i++) {
            String tmp = sArr.get(4);
            sArr.remove(4);
            sArr.add(0,tmp);
        }

        for (String s: sArr
             ) {
            System.out.println(s);
        }
    }
}
