package com.javarush.task.task07.task0710.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class НачалоСписка {
    public static void main(String[] args) throws IOException {
        List<String> sArr = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            sArr.add(0,reader.readLine());
        }

        for (String s: sArr
             ) {
            System.out.println(s);
        }
    }
}
