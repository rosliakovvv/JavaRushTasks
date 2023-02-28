package com.javarush.task.task16.task1616.Считаем_секунды.vov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2_1616 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        reader.readLine();
        stopwatch.interrupt();
        reader.close();
    }

    public static class Stopwatch extends Thread {
        private int sec;

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    sec++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(sec);
            }
        }
    }
}
