package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Не_пашет {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());

        System.out.println("Sum = " + (n1 + n2));
    }
}
