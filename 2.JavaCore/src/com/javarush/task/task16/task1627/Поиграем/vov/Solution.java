package com.javarush.task.task16.task1627.Поиграем.vov;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;
        public static ArrayList<String> steps = new ArrayList<>();

        static {
            steps.add("1 - Начало");
            steps.add("2 - Сбор");
            steps.add("3 - Рост");
            steps.add("4 - На врагов");
        }

        protected Gamer gamer1 = new Gamer("Sidorov", 5);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Ivanov", 3);

        @Override
        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();
            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }


    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            try {
                for (String step : OnlineGame.steps) {
                    System.out.println(getName() + ":" + step);
                    Thread.sleep(1000 / rating);
                }
                if (!OnlineGame.isWinnerFound) {
                    System.out.println(getName() + " - победитель!");
                    OnlineGame.isWinnerFound = true;
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + " - проиграл");
            }
        }
    }
}
