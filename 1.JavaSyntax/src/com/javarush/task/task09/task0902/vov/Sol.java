package com.javarush.task.task09.task0902.vov;

public class Sol {
    public static void main(String[] args) {
        System.out.println(method1());
    }


    private static String getPrevMetName() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        // это имя метода, который вызвал текущий метод
        // если не понятно, то смотрим рис в Tips
        return stackTraceElement[3].getMethodName();

    }

    public static String method1() {
        System.out.println(method2());
        return getPrevMetName();

    }

    public static String method2() {
        System.out.println(method3());
        return getPrevMetName();
    }

    public static String method3() {
        System.out.println(method4());
        return getPrevMetName();
    }

    public static String method4() {
        System.out.println(method5());
        return getPrevMetName();
    }

    public static String method5() {
        return getPrevMetName();
    }
}

