package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> integers = new ArrayList<Integer>();

        for (int i = 0; i <10 ; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = integers.size()-1; i >=0 ;) {
            System.out.println(integers.get(i));
            i--;
        }


    }
}
