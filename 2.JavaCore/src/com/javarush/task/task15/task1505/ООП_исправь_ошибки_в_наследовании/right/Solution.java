package com.javarush.task.task15.task1505.ООП_исправь_ошибки_в_наследовании.right;

/*
ООП - исправь ошибки в наследовании
*/

public class Solution {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {
        @Override
        public int getWeight() {
            return 75;
        }

        @Override
        public int getHeight() {
            return 180;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
    }
}