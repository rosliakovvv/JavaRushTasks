package com.javarush.task.task16.task1616.Считаем_секунды.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();

        reader.readLine();
        stopwatch.interrupt();

        in.close();
        reader.close();
    }

    public static class Stopwatch extends Thread {

        private int seconds;

        @Override
        public void run() {

            try {
                while (!isInterrupted()) {
                    seconds++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                // Они выведутся когда создаться исключение (искусственное прерывание)
                System.out.println(seconds);
            }
        }
    }
}

