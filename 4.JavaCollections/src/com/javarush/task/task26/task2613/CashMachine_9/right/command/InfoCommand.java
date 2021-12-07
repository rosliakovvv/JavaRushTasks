package com.javarush.task.task26.task2613.CashMachine_9.right.command;

import com.javarush.task.task26.task2613.CashMachine_9.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_9.right.CurrencyManipulator;
import com.javarush.task.task26.task2613.CashMachine_9.right.CurrencyManipulatorFactory;

class InfoCommand implements Command {

    @Override
    public void execute() {
        ConsoleHelper.writeMessage("Information:");
        boolean hasMoney = false;
        for (CurrencyManipulator manipulator : CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
            if (manipulator.hasMoney()) {
                hasMoney = true;
                ConsoleHelper.writeMessage("\t" + manipulator.getCurrencyCode() + " - " + manipulator.getTotalAmount());
            }
        }

        if (!hasMoney) {
            ConsoleHelper.writeMessage("No money available.");
        }
    }
}
