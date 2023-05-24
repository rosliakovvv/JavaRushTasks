package com.javarush.task.task17.task1721.Транзакционность.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBR {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        String str1 = reader.readLine();

        System.out.println(str + ", " + str1);
    }

}
