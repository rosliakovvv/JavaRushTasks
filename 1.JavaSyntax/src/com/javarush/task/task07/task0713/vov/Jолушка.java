package com.javarush.task.task07.task0713.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Jолушка {

    public static List<Integer> mArr;

    public static void main(String[] args) throws IOException {

        mArr = new ArrayList<>();
        List<Integer> divArr2 = new ArrayList<>();
        List<Integer> divArr3 = new ArrayList<>();
        List<Integer> oArr = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mArr.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < mArr.size(); i++) {
            if (mArr.get(i) % 3 == 0) {
                divArr3.add(0, mArr.get(i));
            } if (mArr.get(i) % 2 == 0) {
                divArr2.add(0, mArr.get(i));
            } else {
                oArr.add(0, mArr.get(i));
            }
        }

        PrintList(mArr);
        System.out.println();
        PrintList(divArr3);
        System.out.println();
        PrintList(divArr2);
    }

    public static void PrintList(List<Integer> arr) {
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}

