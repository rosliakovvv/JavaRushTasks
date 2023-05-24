package com.javarush.task.task18.task1816.Английские_буквы.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fN = "2.JavaCore/src/com/javarush/task/task18/task1816/Английские_буквы/vov/";

        int countOfABC = 0;

        try (FileInputStream fr = new FileInputStream(fN + args[0])) {
            while (fr.available() > 0) {

                // Надо ввести переменную, потому что операция чтения смещает указатель в файле.
                byte b = (byte) fr.read();

                if ((b >= 65 && b <= 90) || (b >= 97 && b <= 122)) {
                    countOfABC++;
                }
            }
        }
        System.out.println(countOfABC);
    }
}
