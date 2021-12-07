package com.javarush.task.task26.task2613.CashMachine_12.right.command;
/*


import com.javarush.task.task26.task2613.CashMachine_12.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_12.right.CurrencyManipulator;
import com.javarush.task.task26.task2613.CashMachine_12.right.CurrencyManipulatorFactory;
import com.javarush.task.task26.task2613.CashMachine_12.right.exception.InterruptOperationException;
import com.javarush.task.task26.task2613.CashMachine_12.right.exception.NotEnoughMoneyException;

import java.util.Map;

class WithdrawCommand implements Command {

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Withdrawing...");

        String currencyCode = null;
        try {
            currencyCode = ConsoleHelper.askCurrencyCode();
        } catch (com.javarush.task.task26.task2613.CashMachine_10.right.exception.InterruptOperationException e) {
            e.printStackTrace();
        }
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);

        while (true) {
            try {
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
                    }
                }

            } catch (NotEnoughMoneyException e) {
                ConsoleHelper.writeMessage("Exact amount is not available");
            }
        }
    }
}
*/
