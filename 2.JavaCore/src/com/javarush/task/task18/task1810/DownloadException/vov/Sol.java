package com.javarush.task.task18.task1810.DownloadException.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sol {

    public static void main(String[] args) throws IOException, DownEx {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String end = reader.readLine();
        String filename = "2.JavaCore/src/com/javarush/task/task18/task1810/DownloadException/vov/" + end + ".txt";

        ArrayList<Integer> arr = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filename)) {
            while (fis.available() > 0 ) {
                arr.add(fis.read());
            }
        }

        if (arr.size() >= 1000) System.out.println( arr.size() + " good");
        else throw new DownEx(arr);




    }

    public static class DownEx extends Exception {

        public DownEx(ArrayList<Integer> arr) {
            System.out.println( arr.size() + " мало");
        }
    }
}
