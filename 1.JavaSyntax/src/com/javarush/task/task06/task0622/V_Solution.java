package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V_Solution {
    // Настоящая сортировка без методов
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        sort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    /*
    Нужно использовать file2.txt цикла для того, чтобы задать не только количество
    сравниваний (возможных перемещений),но и количество повторений этих 
    сравниваний (перемещений). Только так цифра сможет переместиться с одного конца массива
    на другой.
    */

    /*
    Первый массив выбирает (а потом переключает) первый элемент, который сы будем сравнивать.
    Второй массив сравнивает выбранный элемент с остальными элементами.
    После того как второй массив прошелся по всем элементам массива, на первом месте окажется самый большой элемент. Первый массив переключит на второй круг. Воторой массив пройдется во второй раз и на втором месте окажется второй по величене элемент и т.д.
     */

    /*
    Причем каждый раз при входе во второй массив сравнения будем начинать с того элемента который сейчас выбран на внешнем массиве, т.к. все предидущие желементы уже прошли сортировку и стоят на своих местах.
     */

    public static void sort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                // Можно посмотреть на индексы которые сравниваем
//                    System.out.println("Сравниваем " + i + " и " +  j);
                if (num[i] < num[j]) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
    }
}
