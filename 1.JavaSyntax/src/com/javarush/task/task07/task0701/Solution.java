package com.javarush.task.task07.task0701;

import java.io.IOException;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] initializeArray = new int[20];
        Scanner scanner = new Scanner(System.in);
                for (int i = 0; i<initializeArray.length; i++){
            initializeArray[i]=scanner.nextInt();
        }

        return initializeArray;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i=0; i<array.length; i++){
            if(max<array[i])
                max = array[i];
        }
        return max;
    }
}
