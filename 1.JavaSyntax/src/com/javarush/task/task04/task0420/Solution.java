package com.javarush.task.task04.task0420;


/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

//        Scanner scanner = new Scanner(System.in);
//
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int n3 = scanner.nextInt();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        if (n1 <= n2 && n1 <= n3) {
            if (n2 <= n3) {
                System.out.println(n3 + " " + n2 + " " + n1);
            } else System.out.println(n2 + " " + n3 + " " + n1);
        }

        if (n2 <= n1 && n2 <= n3) {
            if (n1 <= n3) {
                System.out.println(n3 + " " + n1 + " " + n2);
            } else System.out.println(n1 + " " + n3 + " " + n2);
        }

        if (n3 <= n2 && n3 <= n1) {
            if (n1 <= n2) {
                System.out.println(n2 + " " + n1 + " " + n3);
            } else System.out.println(n1 + " " + n2 + " " + n3);
        }

    }
}
