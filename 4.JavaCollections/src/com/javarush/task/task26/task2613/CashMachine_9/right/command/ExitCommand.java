package com.javarush.task.task26.task2613.CashMachine_9.right.command;

import com.javarush.task.task26.task2613.CashMachine_9.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_9.right.exception.InterruptOperationException;

class ExitCommand implements Command {

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Do you really want to exit? <y,n>");
        String result = ConsoleHelper.readString();
        if (result != null && "y".equals(result.toLowerCase())) {
            ConsoleHelper.writeMessage("Thank you for visiting JavaRush cash machine. Good luck.");
        } else {
            //TODO process NO
        }
    }
}
