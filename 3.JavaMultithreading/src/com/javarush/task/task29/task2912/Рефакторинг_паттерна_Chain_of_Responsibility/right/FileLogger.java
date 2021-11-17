package com.javarush.task.task29.task2912.Рефакторинг_паттерна_Chain_of_Responsibility.right;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to file: " + message);
    }
}
