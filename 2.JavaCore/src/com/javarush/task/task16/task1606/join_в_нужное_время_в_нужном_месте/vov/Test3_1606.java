package com.javarush.task.task16.task1606.join_в_нужное_время_в_нужном_месте.vov;

import java.util.ArrayList;
import java.util.List;

public class Test3_1606 {

    public static void main(String[] args) throws InterruptedException {
        PrintListThread f = new PrintListThread("f");
        PrintListThread s = new PrintListThread("s");
        f.start();
        f.join();
        s.start();
    }

    public static List<String> createListThread(int n) {
        List<String> stringList = new ArrayList<>();

        if (n < 0 ) return stringList;

        for (int i = 0; i < n; i++) {
            stringList.add(String.format("%s", i + 1));
        }
        return stringList;
    }

    public static void printListThread(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }


    public static class PrintListThread extends Thread{

        public PrintListThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            printListThread(createListThread(10), getName());
        }
    }

}

