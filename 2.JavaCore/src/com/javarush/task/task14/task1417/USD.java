package com.javarush.task.task14.task1417;

/**
 * Created by User on 09.04.2020.
 */
public class USD extends Money {
    public  String getCurrencyName(){
        return "USD";
    }
    public USD(double amouth){
        super(amouth);
    }
}
