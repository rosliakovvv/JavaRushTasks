package com.javarush.task.task18.task1822.Поиск_данных_внутри_файла.vov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String end = reader.readLine();
        String fileName = "2.JavaCore/src/com/javarush/task/task18/task1822/Поиск_данных_внутри_файла/vov/" + end + ".txt";

        String s;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((s = br.readLine()) != null) {
                if (s.startsWith(args[0] + " ")) {
                    System.out.println(s);
                }
            }
        }
    }
}
