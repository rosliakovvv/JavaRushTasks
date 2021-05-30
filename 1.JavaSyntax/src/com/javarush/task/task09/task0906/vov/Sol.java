package com.javarush.task.task09.task0906.vov;

public class Sol {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        /*
        Потому-что в массиве элементом под индексом 0 является сам вызов StackTrace,
        элементом 1 является метод в котором мы вызываем StackTrace
        и элементом 2 метод, который вызвал метод в котором и вызывается StackTrace.
         */

        System.out.println(stackTraceElement[2].getClassName() + " : " + stackTraceElement[2].getMethodName() + " : " + text);
    }
}
