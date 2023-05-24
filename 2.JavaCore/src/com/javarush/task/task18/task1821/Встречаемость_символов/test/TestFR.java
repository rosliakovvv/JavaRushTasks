package com.javarush.task.task18.task1821.Встречаемость_символов.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFR {

    public static void main(String[] args) throws IOException {

        try (FileReader fr = new FileReader("2.JavaCore/src/com/javarush/task/task18/task1821/Встречаемость_символов/test/A.txt")) {

            // Можно сравнить русские и английские буквы.
            int n = fr.read();
            System.out.println(n);
        }
    }
}
