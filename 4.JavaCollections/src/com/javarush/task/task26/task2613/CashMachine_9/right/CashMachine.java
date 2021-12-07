package com.javarush.task.task26.task2613.CashMachine_9.right;

import com.javarush.task.task26.task2613.CashMachine_9.right.command.CommandExecutor;
import com.javarush.task.task26.task2613.CashMachine_9.right.exception.InterruptOperationException;

import java.util.Locale;

public class CashMachine {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try {
            Operation operation;
            do {
                operation = ConsoleHelper.askOperation();
                CommandExecutor.execute(operation);
            } while (operation != Operation.EXIT);
        } catch (InterruptOperationException ignored) {
            ConsoleHelper.writeMessage("Terminated. Thank you for visiting JavaRush cash machine. Good luck.");
        }
    }
}
