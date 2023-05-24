package com.javarush.task.task18.task1826.Шифровка.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

    public static void main(String[] args) throws IOException {

        String par = args[0];

        String fileName1 = "2.JavaCore/src/com/javarush/task/task18/task1826/Шифровка/vov/" + args[1] + ".txt";
        String fileName2 = "2.JavaCore/src/com/javarush/task/task18/task1826/Шифровка/vov/" + args[2] + ".txt";


        if (!(par.equals("-e") || par.equals("-d"))) return;

        try (FileInputStream fis = new FileInputStream(fileName1);
             FileOutputStream fos = new FileOutputStream(fileName2)) {

            if (par.equals("-e")) {
                while (fis.available() > 0) {
                    fos.write(fis.read() + 32);
                }
            }

            if (par.equals("-d")) {
                while (fis.available() > 0) {
                    fos.write(fis.read() - 32);
                }
            }
        }
    }
}
