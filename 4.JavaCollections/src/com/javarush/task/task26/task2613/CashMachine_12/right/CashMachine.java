package com.javarush.task.task26.task2613.CashMachine_12.right;

import com.javarush.task.task26.task2613.CashMachine_10.right.command.CommandExecutor;
import com.javarush.task.task26.task2613.CashMachine_10.right.exception.InterruptOperationException;
import com.javarush.task.task26.task2613.CashMachine_11.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_11.right.Operation;

import java.util.Locale;

public class CashMachine {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try {
            com.javarush.task.task26.task2613.CashMachine_11.right.Operation operation = com.javarush.task.task26.task2613.CashMachine_11.right.Operation.LOGIN;
            CommandExecutor.execute(operation);
            do {
                operation = ConsoleHelper.askOperation();
                CommandExecutor.execute(operation);
            } while (operation != Operation.EXIT);
        } catch (InterruptOperationException ignored) {
            ConsoleHelper.writeMessage("Terminated. Thank you for visiting JavaRush cash machine. Good luck.");
        }
    }
}
