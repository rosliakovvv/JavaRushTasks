package com.javarush.task.task14.task1417.for_java_rush.right;

/**
 * Created by User on 09.04.2020.
 */
public class Hryvnia extends Money {
    Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
