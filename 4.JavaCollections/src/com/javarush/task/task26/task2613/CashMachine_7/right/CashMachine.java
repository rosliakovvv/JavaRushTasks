package com.javarush.task.task26.task2613.CashMachine_7.right;

import com.javarush.task.task26.task2613.CashMachine_5.right.ConsoleHelper;
import com.javarush.task.task26.task2613.CashMachine_5.right.CurrencyManipulator;
import com.javarush.task.task26.task2613.CashMachine_5.right.CurrencyManipulatorFactory;

import java.util.Locale;

public class CashMachine {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        String currencyCode = ConsoleHelper.askCurrencyCode();

        String[] digits = ConsoleHelper.getValidTwoDigits(currencyCode);
        int denomination = Integer.parseInt(digits[0]);
        int count = Integer.parseInt(digits[1]);

        CurrencyManipulator manipulatorByCurrencyCode = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        manipulatorByCurrencyCode.addAmount(denomination, count);
        manipulatorByCurrencyCode.getTotalAmount();
    }
}
