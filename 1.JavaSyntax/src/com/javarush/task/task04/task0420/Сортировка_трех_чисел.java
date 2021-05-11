package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Сортировка_трех_чисел {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n_1 = Integer.parseInt(reader.readLine());
        int n_2 = Integer.parseInt(reader.readLine());
        int n_3 = Integer.parseInt(reader.readLine());

        if (n_1 < n_2) {
            if (n_2 < n_3) {
                System.out.println(n_3 +" " + n_2 + " " + n_1);
            } else if (n_2 > n_3) {
                System.out.println(n_2 +" " + n_3 + " " + n_1);
            }
        }

        if (n_2 < n_3) {
            if (n_1 < n_3) {
                System.out.println(n_3 +" " + n_2 + " " + n_1);
            } else if (n_2 > n_3) {
                System.out.println(n_2 +" " + n_3 + " " + n_1);
            }
        }


    }


}
