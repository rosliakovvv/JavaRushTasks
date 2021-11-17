package com.javarush.task.task24.task2407.Реализация_интерфейса_используя_локальный_класс.right;

public class Mouse implements Pet, Sayable {
    @Override
    public Sayable toSayable(int i) {
        return this;
    }

    @Override
    public String say() {
        return "Мышь пищит.";
    }
}
