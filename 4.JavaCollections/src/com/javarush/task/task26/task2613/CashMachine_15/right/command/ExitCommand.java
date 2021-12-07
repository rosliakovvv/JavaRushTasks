package com.javarush.task.task26.task2613.CashMachine_15.right.command;

import com.javarush.task.task26.task2613.CashMachine_13.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_13.right.command.Command;
import com.javarush.task.task26.task2613.CashMachine_13.right.exception.InterruptOperationException;


/*
import java.util.ResourceBundle;

class ExitCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.exit");

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));
        String result = ConsoleHelper.readString();
        if (result != null && "y".equals(result.toLowerCase())) {
            ConsoleHelper.writeMessage(res.getString("thank.message"));
        } else {
            //TODO process NO
        }
    }
}
*/
