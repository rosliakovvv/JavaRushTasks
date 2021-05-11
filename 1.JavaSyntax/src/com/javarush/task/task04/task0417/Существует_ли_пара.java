package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Существует_ли_пара {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b & a != c) {
            System.out.println(a + " " + b);
        } else if (a == c & a != b) {
            System.out.println(a + " " + c);
        } else if (b == c & a != b) {
            System.out.println(b + " " + c);
        } else if (a == b & a == c & b == c) {
            System.out.println(a + b + c);
        } else System.out.println("Все числа разные");


    }
}

