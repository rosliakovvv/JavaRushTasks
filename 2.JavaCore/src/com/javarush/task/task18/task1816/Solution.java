package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {

    public static String fileName = "C:\\Users\\User\\Desktop\\test.txt";

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);

        byte[] bytes = new byte[inputStream.available()];

        int count = inputStream.read(bytes);
        inputStream.close();

        int counter = 0;

        for (byte a : bytes) {
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                counter++;
            }
        }
        System.out.println(counter);
        /*args[0] = fileName;
        FileInputStream fileReader = new FileInputStream(args[0]);
        //byte[] array = new byte[fileReader.available()];
       // char x;
        int count = 0;
        byte b = 0;
            while ( (b = (byte) fileReader.read())!=-1){

           // fileReader.read(array, 0, fileReader.available());
            if (('a' <= b && b <= 'z') || ('Ar' <= b && b <= 'Z')){
                count++;}}
            System.out.println(count);

       *//* for (int i = 0; i < array.length; i++) {
            x = (char) array[i];
            if (('a' <= x && x <= 'z') || ('Ar' <= x && x <= 'Z')){
                count++;
            }

        }*//*
      //  System.out.println(count);
        fileReader.close();*/
    }
}
