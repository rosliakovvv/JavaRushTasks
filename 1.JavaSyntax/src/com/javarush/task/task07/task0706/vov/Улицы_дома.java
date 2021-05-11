package com.javarush.task.task07.task0706.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Улицы_дома {
    public static void main(String[] args) throws IOException {

        int even = 0;   // четные
        int odd = 0;    // нечетные

        int[] iFifteen = new int[6];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < iFifteen.length; i++) {
            iFifteen[i] = Integer.parseInt(reader.readLine());
        }

        for (int i : iFifteen
        ) {
            if (i % 2 == 0) {
                even += i;
            } else odd += i;
        }

        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
