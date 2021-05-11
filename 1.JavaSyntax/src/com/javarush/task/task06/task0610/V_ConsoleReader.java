package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V_ConsoleReader {

    public static void main(String[] args) {

    }

    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static int readInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        return n;
    }

    public static double readDouble() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(reader.readLine());
        return n;
    }

    public static boolean readBoolean() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean n = Boolean.parseBoolean(reader.readLine());
        return n;
    }
}
