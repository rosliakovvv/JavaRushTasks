package com.javarush.task.task08.task0822.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = getIntList();
        System.out.println(getMin(integerList));
    }

    public static int getMin(List<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)) {
                min = array.get(i);
            }
        }
        return min;
    }

    private static List<Integer> getIntList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listN = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            listN.add(Integer.parseInt(reader.readLine()));
        }
        return listN;
    }
}
