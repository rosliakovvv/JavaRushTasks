package com.javarush.task.task26.task2613.CashMachine_14.right.command;

import com.javarush.task.task26.task2613.CashMachine_10.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_10.right.CurrencyManipulator;
import com.javarush.task.task26.task2613.CashMachine_10.right.CurrencyManipulatorFactory;

import java.util.ResourceBundle;
/*

class InfoCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.info");

    @Override
    public void execute() {
        ConsoleHelper.writeMessage(res.getString("before"));
        boolean hasMoney = false;
        for (CurrencyManipulator manipulator : CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
            if (manipulator.hasMoney()) {
                hasMoney = true;
                ConsoleHelper.writeMessage("\t" + manipulator.getCurrencyCode() + " - " + manipulator.getTotalAmount());
            }
        }

        if (!hasMoney) {
            ConsoleHelper.writeMessage(res.getString("no.money"));
        }
    }
}
*/
