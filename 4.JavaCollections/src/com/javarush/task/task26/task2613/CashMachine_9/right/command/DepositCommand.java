package com.javarush.task.task26.task2613.CashMachine_9.right.command;

import com.javarush.task.task26.task2613.CashMachine_9.right.CurrencyManipulator;
import com.javarush.task.task26.task2613.CashMachine_9.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_9.right.CurrencyManipulatorFactory;
import com.javarush.task.task26.task2613.CashMachine_9.right.exception.InterruptOperationException;

class DepositCommand implements Command {


    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Depositing...");
        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);

        while (true) {
            String[] split = ConsoleHelper.getValidTwoDigits(currencyCode);
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
