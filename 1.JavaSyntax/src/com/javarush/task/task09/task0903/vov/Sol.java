package com.javarush.task.task09.task0903.vov;

public class Sol {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    public static int getLineMet() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[3].getLineNumber();
    }

    public static int method1() {
        System.out.println(method2());
        return getLineMet();

    }

    public static int method2() {
        System.out.println(method3());
        return getLineMet();
    }

    public static int method3() {
        System.out.println(method4());
        return getLineMet();
    }

    public static int method4() {
        System.out.println(method5());
        return getLineMet();
    }

    public static int method5() {
        return getLineMet();

    }

}

