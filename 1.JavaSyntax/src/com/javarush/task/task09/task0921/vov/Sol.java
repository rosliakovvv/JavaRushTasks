package com.javarush.task.task09.task0921.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();

        try {
            while (true) {
                int a = Integer.parseInt(reader.readLine());
                arrayList.add(a);
            }
        } catch (NumberFormatException e) {
            for (Integer i : arrayList
            ) {
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
