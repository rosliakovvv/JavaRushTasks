package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class
Максимум_четырех_чисел {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int min_1 = min(a, b);
        int min_2 = min(c, d);

        System.out.println(min_1 > min_2 ? min_1 : min_2);

    }

    public static int min(int x, int y) {
        int z = (x > y) ? x : y;
        return z;

    }

}
