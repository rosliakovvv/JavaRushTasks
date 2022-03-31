package com.javarush.task.task16.task1604.Вывод_стек_трейса.task;

/*
Вывод стек-трейса
*/

/*
public class Solution_old {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread_v4());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
}
*/
