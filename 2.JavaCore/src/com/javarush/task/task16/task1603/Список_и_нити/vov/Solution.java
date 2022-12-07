package com.javarush.task.task16.task1603.Список_и_нити.vov;

import java.util.ArrayList;
import java.util.List;

/*
Список и нити
*/

public class Solution {

    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код
        SpecialThread st_1 = new SpecialThread();
        SpecialThread st_2 = new SpecialThread();
        SpecialThread st_3 = new SpecialThread();
        SpecialThread st_4 = new SpecialThread();
        SpecialThread st_5 = new SpecialThread();

        Thread thread_1 = new Thread(st_1);
        Thread thread_2 = new Thread(st_2);
        Thread thread_3 = new Thread(st_3);
        Thread thread_4 = new Thread(st_4);
        Thread thread_5 = new Thread(st_5);

        list.add(thread_1);
        list.add(thread_2);
        list.add(thread_3);
        list.add(thread_4);
        list.add(thread_5);


        //или короче
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));


        //или еще короче
        for (int i = 0; i < list.size(); i++) {
            list.add(new Thread(new SpecialThread()));
        }
    }

    public static class SpecialThread implements Runnable {

        public void run() {
            System.out.println("it's a run method inside SpecialThread_v4");
        }
    }
}
