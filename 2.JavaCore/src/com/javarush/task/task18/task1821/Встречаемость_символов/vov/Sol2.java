package com.javarush.task.task18.task1821.Встречаемость_символов.vov;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sol2 {

    public static void main(String[] args) throws IOException {

        int[] arr = new int[128];

        try (FileInputStream fis = new FileInputStream("2.JavaCore/src/com/javarush/task/task18/task1821/Встречаемость_символов/vov/eng.txt")) {

            // Мы можем импользовать fis так как в услових задачи только анг тектс и кодировка будет совпадать
            while (fis.available() > 0) {
                arr[fis.read()]++;
            }
        }

        // i соответсвует символу в таблице ascii,т.к. мы создали сами этот массив по ее образу
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println((char) i + " " + arr[i]);
            }
        }
    }
}
