package com.javarush.task.task09.task0901.vov;

public class Sol2 {
    public static void main(String[] args) {
        met1();
    }

    public static StackTraceElement[] met1() {
        met2();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] met2() {
        met3();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] met3() {
        met4();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] met4() {
        met5();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] met5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());

        }
        return stackTraceElements;
    }
}

