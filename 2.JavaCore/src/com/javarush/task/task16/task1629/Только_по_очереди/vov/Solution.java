package com.javarush.task.task16.task1629.Только_по_очереди.vov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        ReadThreeStrings rts1 = new ReadThreeStrings();
        ReadThreeStrings rts2 = new ReadThreeStrings();

        rts1.start();
        rts1.join();

        rts2.start();
        rts2.join();

        rts1.printMethod();
        rts2.printMethod();

    }

    public static class ReadThreeStrings extends Thread {
        ArrayList<String> res = new ArrayList<>();
        int count;

        @Override
        public void run() {
            try {
                while (count < 3) {
                    res.add(reader.readLine() + " ");
                    count++;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public void printMethod() {
            for (String s : res) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
