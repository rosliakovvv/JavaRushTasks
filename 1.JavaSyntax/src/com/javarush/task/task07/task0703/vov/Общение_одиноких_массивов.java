package com.javarush.task.task07.task0703.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Общение_одиноких_массивов {
    public static void main(String[] args) throws IOException {
        String[] sTen = new String[10];
        int[] iTen = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < sTen.length; i++) {
            sTen[i] = reader.readLine();
            iTen[i] = sTen[i].length();
        }

//        for (int i = 0; i < iTen.length; i++) {
//            System.out.println(iTen[i]);
//        }

        for (int i: iTen
             ) {
            System.out.println(i);
        }



    }
}
