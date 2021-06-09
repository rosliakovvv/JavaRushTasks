package com.javarush.task.task10.task1011.vov;

public class Sol {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";

        for (int i = 0; i < 40; i++) {
            System.out.println(i + 1 + "\t|" +  text);
            text = text.substring(1); // возвращает туже строку начиная с 1 индекса а не с 0
        }
    }
}
