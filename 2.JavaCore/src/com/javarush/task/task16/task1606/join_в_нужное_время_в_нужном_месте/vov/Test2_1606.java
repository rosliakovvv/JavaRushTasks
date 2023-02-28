package com.javarush.task.task16.task1606.join_в_нужное_время_в_нужном_месте.vov;

import java.util.ArrayList;
import java.util.List;

public class Test2_1606 {

    public static void main(String[] args) throws InterruptedException {
        PrintListThread first = new PrintListThread("first");
        PrintListThread second = new PrintListThread("second");
        first.start();
        first.join();
        second.start();

    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> createList(int n) {
        List<String> arr = new ArrayList<>();

        if (n < 0) return arr;

        for (int i = 0; i < n; i++) {
            arr.add(String.format("%d", i + 1));
        }
        return arr;
    }

    public static class PrintListThread extends Thread {

        public PrintListThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            printList(createList(20), getName());
        }
    }
}

