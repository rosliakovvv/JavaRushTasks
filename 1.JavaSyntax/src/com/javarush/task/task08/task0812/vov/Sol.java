package com.javarush.task.task08.task0812.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i, Integer.parseInt(reader.readLine()));
        }



//        for (Integer item : numbers) {
//            System.out.println(item);
//        }

    }

}
