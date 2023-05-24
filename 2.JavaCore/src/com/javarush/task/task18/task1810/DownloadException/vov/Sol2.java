package com.javarush.task.task18.task1810.DownloadException.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2 {

    public static void main(String[] args) throws IOException, DEx {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String end = reader.readLine();
            String file = "2.JavaCore/src/com/javarush/task/task18/task1810/DownloadException/vov/" + end + ".txt";

            try (FileInputStream fis = new FileInputStream(file)) {

                if (fis.available() < 1000) throw new DEx();
            }
        }
    }

    public static class DEx extends Exception {

    }
}

