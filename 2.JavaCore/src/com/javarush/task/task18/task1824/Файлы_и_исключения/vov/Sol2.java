package com.javarush.task.task18.task1824.Файлы_и_исключения.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String fileName = reader.readLine();

            try (FileInputStream fis = new FileInputStream(fileName)) {

            } catch (FileNotFoundException e) {
                System.out.println(fileName + "file not found ");
                break;
            }
        }
    }
}