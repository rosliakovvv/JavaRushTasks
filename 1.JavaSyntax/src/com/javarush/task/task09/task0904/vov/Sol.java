package com.javarush.task.task09.task0904.vov;

public class Sol {
    public static void main(String[] args) {
        int stackTraceLengthBig = method1().length; // вызвали метод10 черед метод1 = 12
        int stackTraceLengthSmall = method10().length; // вызвали метод10 напрямую = 3
//        System.out.println(stackTraceLengthBig);
//        System.out.println(stackTraceLengthSmall);
        System.out.println(stackTraceLengthBig - stackTraceLengthSmall + 1);


    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        return method3();
    }

    public static StackTraceElement[] method3() {
        return method4();
    }

    public static StackTraceElement[] method4() {
        return method5();
    }

    public static StackTraceElement[] method5() {
        return method6();
    }

    public static StackTraceElement[] method6() {
        return method7();
    }

    public static StackTraceElement[] method7() {
        return method8();
    }

    public static StackTraceElement[] method8() {
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }

}

