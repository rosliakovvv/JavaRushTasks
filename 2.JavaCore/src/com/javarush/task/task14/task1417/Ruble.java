package com.javarush.task.task14.task1417;

/**
 * Created by User on 09.04.2020.
 */
public class Ruble extends Money {
    public  String getCurrencyName(){
        return "RUB";
    }
    public Ruble(double amouth){
        super(amouth);
    }
}
