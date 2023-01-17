package com.javarush.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        // Переменная одна на всех игроков
        public static volatile boolean isWinnerFound = false;
        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();
            // Нити игроков не будет остановленны, пока один из них не выйграет
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
                for (String tx : OnlineGame.steps
                ) {
                    System.out.println(getName() + ":" + tx);
                    // Чем больше рейтинг тем быстрее нить напечатает элементы списка
                    // Вывод на экран не равномерный ))
                    Thread.sleep(1000 / rating);
                }
                // Сюда попадает первый игрок потому что проходит условие
                if (!OnlineGame.isWinnerFound) {
                    System.out.println(getName() + ":победитель!");
                    // Первый изменяет метку победителя
                    OnlineGame.isWinnerFound = true;
                }
                //
            } catch (InterruptedException e) {
                // Игрок попадает сюда изза того что был вызван метод interrupt
                System.out.println(getName() + ":проиграл");
            }
            //Add your code here - добавь код тут
        }
    }
}
