package com.javarush.task.task15.task1530.Template_pattern.nast;

/**
 * Created by User on 27.05.2020.
 */
public abstract class DrinkMaker {
    public abstract void getRightCup();

    public abstract void putIngredient();

    public abstract void pour();

    public void  makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}