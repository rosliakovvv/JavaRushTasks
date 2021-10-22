package com.javarush.task.task15.task1501.ООП_Расставить_интерфейсы.vov1;

public class Solution {

    public static void main(String[] args) {

    }

    public interface Movable {

        boolean isMovable();
    }

    public interface Sellable {

        Object getAllowedAction(String name);
    }

    public interface Discountable {

        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {

        @Override
        public boolean isMovable() {
            return false;
        }

        @Override
        public Clothes getAllowedAction(String name) {
            return this.getAllowedAction();
        }

        @Override
        public Clothes getAllowedAction() {
            return this.getAllowedAction();
        }
    }
}
