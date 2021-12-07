package com.javarush.task.task26.task2613.CashMachine_12.right.command;

import com.javarush.task.task26.task2613.CashMachine_11.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_11.right.CurrencyManipulator;
import com.javarush.task.task26.task2613.CashMachine_11.right.CurrencyManipulatorFactory;
import com.javarush.task.task26.task2613.CashMachine_11.right.command.Command;
import com.javarush.task.task26.task2613.CashMachine_11.right.exception.InterruptOperationException;

class DepositCommand implements com.javarush.task.task26.task2613.CashMachine_11.right.command.Command {


    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Depositing...");
        String currencyCode = null;
        try {
            currencyCode = ConsoleHelper.askCurrencyCode();
        } catch (com.javarush.task.task26.task2613.CashMachine_10.right.exception.InterruptOperationException e) {
            e.printStackTrace();
        }
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);

        while (true) {
            String[] split = new String[0];
            try {
                split = ConsoleHelper.getValidTwoDigits(currencyCode);
            } catch (com.javarush.task.task26.task2613.CashMachine_10.right.exception.InterruptOperationException e) {
                e.printStackTrace();
            }
            try {
                int denomination = Integer.parseInt(split[0]);
                int count = Integer.parseInt(split[1]);
                manipulator.addAmount(denomination, count);
                ConsoleHelper.writeMessage(String.format("%d %s was deposited successfully", (denomination * count), currencyCode));
                break;
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Please specify valid data.");
            }
        }
    }
}
