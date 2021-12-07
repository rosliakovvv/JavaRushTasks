package com.javarush.task.task26.task2613.CashMachine_8.right;

import com.javarush.task.task26.task2613.CashMachine_8.right.command.CommandExecutor;

import java.util.Locale;

public class CashMachine {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Operation operation;
        do {
            operation = ConsoleHelper.askOperation();
            CommandExecutor.execute(operation);
        } while (operation != Operation.EXIT);
    }
}
