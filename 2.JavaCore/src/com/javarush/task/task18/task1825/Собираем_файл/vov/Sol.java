package com.javarush.task.task18.task1825.Собираем_файл.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FilesComparator fc = new FilesComparator();

        Set<String> files = new TreeSet<>(fc);

        String outFile = null;
        String readStr;

        while (!(readStr = reader.readLine()).equals("end")) {
            files.add(readStr);

            if (outFile == null) {
                int indexOfSuffix = readStr.lastIndexOf(".part");
                outFile = readStr.substring(0, indexOfSuffix);
            }
        }

        if (outFile == null) return;

        String fullOutName = "2.JavaCore/src/com/javarush/task/task18/task1825/Собираем_файл/right/" + outFile + ".txt";

        try (FileOutputStream fos = new FileOutputStream(fullOutName)) {

            for (String file : files) {

                String fullInName = "2.JavaCore/src/com/javarush/task/task18/task1825/Собираем_файл/right/" + file + ".txt";

                try (FileInputStream fis = new FileInputStream(fullInName)) {

                    // Узнаем кол-во порции для чтения
                    byte[] bytesBuffer = new byte[fis.available()];

                    while (fis.available() > 0) {
                        int bytesRead = fis.read(bytesBuffer);
                        fos.write(bytesBuffer, 0, bytesRead);
                    }
                }
            }
        }
    }

    public static class FilesComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {

            String[] partOfFile1 = o1.split(".part");
            String[] partOfFile2 = o2.split(".part");

            int i1 = Integer.parseInt(partOfFile1[partOfFile1.length - 1]);
            int i2 = Integer.parseInt(partOfFile2[partOfFile2.length - 1]);
            return i1 - i2;
        }
    }
}

