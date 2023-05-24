package com.javarush.task.task07.task0705;

/* 
Один большой массив и file2.txt маленьких
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrayBig = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<arrayBig.length; i++) arrayBig[i] = scanner.nextInt();

        int[] arrayLittle = new int[10];
        int[] arrayLittle2 = new int[10];
        for(int i =0; i<arrayBig.length; i++){
            if(i<arrayBig.length/2){arrayLittle [i]= arrayBig[i];}
            else {arrayLittle2[i-arrayBig.length/2] = arrayBig[i];
        System.out.println(arrayLittle2[i-arrayBig.length/2]);
        }}

        //for(int j = 0 ; j<arrayLittle2.length; j++) System.out.println(arrayLittle2[j]);
    }
}
