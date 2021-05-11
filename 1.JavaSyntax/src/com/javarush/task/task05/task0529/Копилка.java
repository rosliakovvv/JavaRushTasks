package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Копилка {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            } else {
                int n = Integer.parseInt(s);
                count += n;
            }
        }
        System.out.println(count);
    }
}