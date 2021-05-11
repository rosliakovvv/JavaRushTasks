package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Среднее_арифметическое {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        double sum = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                System.out.println(sum / count);
                break;
            }
            count++;
            sum += number;

        }
    }
}

