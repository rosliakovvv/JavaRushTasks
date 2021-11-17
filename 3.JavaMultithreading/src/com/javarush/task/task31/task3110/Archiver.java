package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by User on 09.09.2020.
 */
public class Archiver {
    public static void main(String[] args) {

        try (BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in))){
            
            System.out.println("Введите полный путь архива:");
            String string1 = reader.readLine();
            System.out.println("Введите путь к файлу, который будем архивировать:");
            String string2 = reader.readLine();

            Path fileArchive = Paths.get(string1);
            ZipFileManager zipFileManager = new ZipFileManager(fileArchive);

            Path filePath = Paths.get(string2);
            zipFileManager.createZip(filePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
