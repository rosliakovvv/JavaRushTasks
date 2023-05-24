package com.javarush.task.task18.task1826.Шифровка.vov;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sol2 {

    public static void main(String[] args) throws IOException {

        String operation = args[0];

        String srcFile = "2.JavaCore/src/com/javarush/task/task18/task1826/Шифровка/vov/" + args[1] + ".txt";
        String resFile = "2.JavaCore/src/com/javarush/task/task18/task1826/Шифровка/vov/" + args[2] + ".txt";

        if (!(operation.equals("-e") || operation.equals("-d"))) return;

        try (FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(resFile)) {

            while (fis.available() > 0) {

                // Зашифровать
                if (operation.equals("-e")) {
                    fos.write(fis.read() + 32);
                }

                // Расшифровать
                if (operation.equals("-d")) {
                    fos.write(fis.read() - 32);
                }
            }
        }
    }
}
