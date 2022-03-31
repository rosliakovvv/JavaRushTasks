package com.javarush.task.task16.task1606.join_в_нужное_время_в_нужном_месте.vov3;

import java.util.ArrayList;
import java.util.List;

public class Sol3 {
    public static void main(String[] args) throws InterruptedException {
        PrintListTreads_v3 first_T = new PrintListTreads_v3("first T");
        PrintListTreads_v3 second_T = new PrintListTreads_v3("second T");

        first_T.start();
        first_T.join();
        second_T.start();
    }

    private static void printList_v3(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    private static List<String> getList_v3(int n) {
        List<String> res = new ArrayList<>();
        if (n < 1) return res;

        for (int i = 0; i < n; i++) {
            res.add(String.format("Строка %d", (i + 1)));
        }
        return res;
    }

    public static class PrintListTreads_v3 extends Thread {

        public PrintListTreads_v3(String name) {
            super(name);
        }

        @Override
        public void run() {
            printList_v3(getList_v3(10), getName());
        }
    }
}
