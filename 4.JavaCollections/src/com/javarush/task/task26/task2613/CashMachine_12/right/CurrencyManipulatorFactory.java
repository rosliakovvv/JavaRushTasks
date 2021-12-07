package com.javarush.task.task26.task2613.CashMachine_12.right;

import com.javarush.task.task26.task2613.CashMachine_11.right.CurrencyManipulator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulatorFactory {
    private static Map<String, com.javarush.task.task26.task2613.CashMachine_11.right.CurrencyManipulator> map = new HashMap<>();

    private CurrencyManipulatorFactory() {
    }

    public static com.javarush.task.task26.task2613.CashMachine_11.right.CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        currencyCode = currencyCode.toUpperCase();
        if (!map.containsKey(currencyCode)) {
            com.javarush.task.task26.task2613.CashMachine_11.right.CurrencyManipulator manipulator = new com.javarush.task.task26.task2613.CashMachine_11.right.CurrencyManipulator(currencyCode);
            map.put(manipulator.getCurrencyCode(), manipulator);
        }
        return map.get(currencyCode);
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
        return map.values();
    }
}
