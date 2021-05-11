package com.javarush.task.task07.task0723.vov;

public class ОбратныйОтсчет {
    public static void main(String[] args) {
        for (int i = 3; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Бум");
    }
}
