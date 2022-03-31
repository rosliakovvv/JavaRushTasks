package com.javarush.task.task16.task1603.Список_и_нити.vov4;

import java.util.ArrayList;
import java.util.List;

public class Sol4 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код...ok

//        SpecialThread_v4 specialThread1 = new SpecialThread_v4();
//        SpecialThread_v4 specialThread2 = new SpecialThread_v4();
//        SpecialThread_v4 specialThread3 = new SpecialThread_v4();
//        SpecialThread_v4 specialThread4 = new SpecialThread_v4();
//        SpecialThread_v4 specialThread5 = new SpecialThread_v4();
//
//        Thread thread1 = new Thread(specialThread1);
//        Thread thread2 = new Thread(specialThread2);
//        Thread thread3 = new Thread(specialThread3);
//        Thread thread4 = new Thread(specialThread4);
//        Thread thread5 = new Thread(specialThread5);
//
//        list.add(thread1);
//        list.add(thread2);
//        list.add(thread3);
//        list.add(thread4);
//        list.add(thread5);

        // или так

        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread_v4()));
        }
    }

    public static class SpecialThread_v4 implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread_v4");
        }
    }
}
