package com.javarush.task.task31.task3112;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;



/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);
        String fileName = Paths.get(url.getFile()).getFileName().toString(); // достаем имя файла из url
        Path result = Paths.get(downloadDirectory.toString() + "/"+ fileName);
        InputStream inputStream = url.openStream();

        Path tempFile = Files.createTempFile("temp-",".tmp");
        Files.copy(inputStream, tempFile);


        return Files.move(tempFile, result,REPLACE_EXISTING);
    }
}
