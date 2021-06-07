package com.javarush.task.task08.task0828.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> mouths = new ArrayList<>();
        mouths.add("Jan");
        mouths.add("Feb");
        mouths.add("Mar");
        mouths.add("Apr");
        mouths.add("May");
        mouths.add("Jun");
        mouths.add("Jul");
        mouths.add("Aug");
        mouths.add("Sep");
        mouths.add("Oct");
        mouths.add("Nov");
        mouths.add("Dec");

        System.out.println("Введите месяц");
        String mouth = reader.readLine();
        int numMouth = mouths.indexOf(mouth) + 1;

        if (mouths.contains(mouth)) {
            System.out.println(mouth + " is the " + numMouth + " mouth");
        } else {
            System.out.println(mouth + " is not a mouth");
        }
    }
}
