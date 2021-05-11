package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V_Циферки {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int even = 0;   // четные
        int odd = 0;    // нечетные

        while (true) {
            x = Integer.parseInt(reader.readLine());
            if (x > 0) break;
        }

        while (x > 0) {
            if (x % 2 == 0) {
                even++;
            } else odd++;

            x /= 10;
        }

        System.out.println("Even: " + even + " " +  "Odd: " + odd);







    }
}
