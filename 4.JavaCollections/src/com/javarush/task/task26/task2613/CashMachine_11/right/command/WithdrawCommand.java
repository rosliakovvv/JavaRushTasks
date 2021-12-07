package com.javarush.task.task26.task2613.CashMachine_11.right.command;


import com.javarush.task.task26.task2613.CashMachine_10.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_10.right.CurrencyManipulator;
import com.javarush.task.task26.task2613.CashMachine_10.right.CurrencyManipulatorFactory;
import com.javarush.task.task26.task2613.CashMachine_10.right.exception.InterruptOperationException;

import java.util.Map;

class WithdrawCommand implements Command {

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Withdrawing...");

        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);

        while (true) {
            ConsoleHelper.writeMessage("Please specify integer amount for withdrawing.");
            String s = ConsoleHelper.readString();
            if (s == null) {
                ConsoleHelper.writeMessage("Please specify valid positive integer amount for withdrawing.");
            } else {
                try {
                    int amount = Integer.parseInt(s);
                    boolean isAmountAvailable = manipulator.isAmountAvailable(amount);
                    if (isAmountAvailable) {
                        Map<Integer, Integer> denominations = manipulator.withdrawAmount(amount);
                        for (Integer item : denominations.keySet()) {
                            ConsoleHelper.writeMessage("\t" + item + " - " + denominations.get(item));
                        }

                        ConsoleHelper.writeMessage(String.format("%d %s was withdrawn successfully", amount, currencyCode));
                        break;
                    } else {
                        ConsoleHelper.writeMessage("Not enough money on your account, please try again");
                    }
                } catch (NumberFormatException e) {
                    ConsoleHelper.writeMessage("Please specify valid positive integer amount for withdrawing.");
                } catch (com.javarush.task.task26.task2613.exception.NotEnoughMoneyException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
