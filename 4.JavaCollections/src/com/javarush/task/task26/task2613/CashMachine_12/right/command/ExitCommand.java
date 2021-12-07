package com.javarush.task.task26.task2613.CashMachine_12.right.command;

import com.javarush.task.task26.task2613.CashMachine_11.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_11.right.command.Command;
import com.javarush.task.task26.task2613.CashMachine_11.right.exception.InterruptOperationException;

class ExitCommand implements com.javarush.task.task26.task2613.CashMachine_11.right.command.Command {

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Do you really want to exit? <y,n>");
        String result = null;
        try {
            result = ConsoleHelper.readString();
        } catch (com.javarush.task.task26.task2613.CashMachine_10.right.exception.InterruptOperationException e) {
            e.printStackTrace();
        }
        if (result != null && "y".equals(result.toLowerCase())) {
            ConsoleHelper.writeMessage("Thank you for visiting JavaRush cash machine. Good luck.");
        } else {
            //TODO process NO
        }
    }
}
