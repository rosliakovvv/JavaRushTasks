package com.javarush.task.task29.task2912.Рефакторинг_паттерна_Chain_of_Responsibility.right;

public interface Logger {
    void inform(String message, int level);

    void setNext(Logger next);

    void info(String message);
}
