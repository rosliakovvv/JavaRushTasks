package com.javarush.task.task16.task1606.join_в_нужное_время_в_нужном_месте.vov2;

import com.javarush.task.task16.task1606.join_в_нужное_время_в_нужном_месте.task.Solution;

import java.util.ArrayList;
import java.util.List;

public class Sol2 {

    public static void main(String[] args) throws InterruptedException {
        PrintListThread_v2 firstThread = new PrintListThread_v2("firstThread");
        PrintListThread_v2 secondThread = new PrintListThread_v2("secondThread");

        firstThread.start();
        firstThread.join();
        secondThread.start();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<String>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }


    public static class PrintListThread_v2 extends Thread {
        public PrintListThread_v2(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }
}
