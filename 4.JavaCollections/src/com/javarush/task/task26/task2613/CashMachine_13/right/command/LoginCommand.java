package com.javarush.task.task26.task2613.CashMachine_13.right.command;

import com.javarush.task.task26.task2613.CashMachine_12.right.CashMachine;
import com.javarush.task.task26.task2613.CashMachine_12.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_12.right.exception.InterruptOperationException;
/*

import java.util.ResourceBundle;

class LoginCommand implements Command {
    private ResourceBundle validCreditCards = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.verifiedCards");


    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Logging in...");

        while (true) {
            ConsoleHelper.writeMessage("Please specify your credit card number and pin code or type 'EXIT' for exiting.");
            String creditCardNumber = ConsoleHelper.readString();
            String pinStr = ConsoleHelper.readString();
            if (creditCardNumber == null || (creditCardNumber = creditCardNumber.trim()).length() != 12 ||
                    pinStr == null || (pinStr = pinStr.trim()).length() != 4) {
                ConsoleHelper.writeMessage("Please specify valid credit card number - 12 digits, pin code - 4 digits.");
            } else {
                try {
                    if (validCreditCards.containsKey(creditCardNumber) && pinStr.equals(validCreditCards.getString(creditCardNumber))) {
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
*/
