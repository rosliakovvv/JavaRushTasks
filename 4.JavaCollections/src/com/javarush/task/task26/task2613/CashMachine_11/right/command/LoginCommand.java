package com.javarush.task.task26.task2613.CashMachine_11.right.command;

import com.javarush.task.task26.task2613.CashMachine_11.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_11.right.exception.InterruptOperationException;

class LoginCommand implements Command {
    private String validCreditCard = "123456789012";
    private String validPin = "1234";

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Logging in...");

        while (true) {
            ConsoleHelper.writeMessage("Please specify your credit card number and pin code or type 'EXIT' for exiting.");
            String creditCardNumber = null;
            try {
                creditCardNumber = ConsoleHelper.readString();
            } catch (com.javarush.task.task26.task2613.CashMachine_10.right.exception.InterruptOperationException e) {
                e.printStackTrace();
            }
            String pinStr = null;
            try {
                pinStr = ConsoleHelper.readString();
            } catch (com.javarush.task.task26.task2613.CashMachine_10.right.exception.InterruptOperationException e) {
                e.printStackTrace();
            }
            if (creditCardNumber == null || (creditCardNumber = creditCardNumber.trim()).length() != 12 ||
                    pinStr == null || (pinStr = pinStr.trim()).length() != 4) {
                ConsoleHelper.writeMessage("Please specify valid credit card number - 12 digits, pin code - 4 digits.");
            } else {
                try {
                    if (creditCardNumber.equals(validCreditCard) && pinStr.equals(validPin)) {
                        ConsoleHelper.writeMessage(String.format("Credit card [%s] is verified successfully!", creditCardNumber));
                        break;
                    } else {
                        ConsoleHelper.writeMessage(String.format("Credit card [%s] is not verified.", creditCardNumber));
                        ConsoleHelper.writeMessage("Please try again or type 'EXIT' for urgent exiting");
                    }
                } catch (NumberFormatException e) {
                    ConsoleHelper.writeMessage("Please specify valid credit card number - 12 digits, pin code - 4 digits.");
                }
            }
        }

    }
}
