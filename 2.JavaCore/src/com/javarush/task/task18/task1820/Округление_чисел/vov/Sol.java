package com.javarush.task.task18.task1820.Округление_чисел.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String end1 = reader.readLine();
        String end2 = reader.readLine();

        String file1 = "2.JavaCore/src/com/javarush/task/task18/task1820/Округление_чисел/vov/" + end1 + ".txt";
        String file2 = "2.JavaCore/src/com/javarush/task/task18/task1820/Округление_чисел/vov/" + end2 + ".txt";

        try (FileInputStream fis = new FileInputStream(file1);
             FileWriter fr = new FileWriter(file2)) {

            Scanner scanner = new Scanner(fis);

            while (scanner.hasNextDouble()) {

                String[] numbers = scanner.nextLine().split(" ");

                for (String n : numbers) {
                    double d = Double.parseDouble(n);
                    int l = (int) Math.round(d);
                    fr.write(l + " ");
                }
            }
        } catch (NumberFormatException e) {}

    }
}
