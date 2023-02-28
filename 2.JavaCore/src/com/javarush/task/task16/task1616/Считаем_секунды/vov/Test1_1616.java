package com.javarush.task.task16.task1616.Считаем_секунды.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1_1616 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);
        reader.close();
    }
}
