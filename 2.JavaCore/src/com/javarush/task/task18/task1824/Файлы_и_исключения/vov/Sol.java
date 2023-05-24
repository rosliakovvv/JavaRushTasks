package com.javarush.task.task18.task1824.Файлы_и_исключения.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        String fileName = null;

        while (true) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                fileName = reader.readLine();
                FileInputStream fis = new FileInputStream(fileName);
                fis.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName + " don't find");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

