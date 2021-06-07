package com.javarush.task.task08.task0823.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String res = "";
        char[] chars = s.toCharArray();
        char ch;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i-1] == ' ') {
                ch = Character.toUpperCase(chars[i]);
            } else ch = chars[i];
            res += ch;
        }
        System.out.println(res);
    }
}
