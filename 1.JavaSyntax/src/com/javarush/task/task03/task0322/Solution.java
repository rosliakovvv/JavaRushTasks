package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String girl_1 = reader.readLine();
        String girl_2 = reader.readLine();
        String girl_3 = reader.readLine();

        System.out.println(girl_1 + " + " +  girl_2 + " + " + girl_3 + " = Чистая любовь, да-да!");
    }
}
