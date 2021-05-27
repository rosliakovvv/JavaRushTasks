package com.javarush.task.task10.task1011.vov;

public class Sol {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        for (int i = 0; i < 40; i++) {
            System.out.println(i + 1 + " - " + text);

            // есть метод для обрезания строки
//            System.out.println(text);
//            text = text.substring(1);
        }

    }
}
