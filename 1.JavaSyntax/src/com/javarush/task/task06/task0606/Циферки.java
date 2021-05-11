package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Циферки {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n;

        while (true) {
            n = Integer.parseInt(reader.readLine());
            if (n <= 0) {
                System.out.println("Input good number please");
            } else break;
        }

        while (n > 0) {
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n /= 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

