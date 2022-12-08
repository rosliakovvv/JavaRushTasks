package com.javarush.task.task16.task1612.Stopwatch_Секундомер.vov;

public class Solution {

    // Стартовый питолет
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner ivanov = new Runner("Иванов", 4);
        Runner petrov = new Runner("Петров", 2);
        // Старт!
        ivanov.start();
        petrov.start();
        Thread.sleep(2000);
        // Финиш!
        isStopped = true;
        // проверка...
        Thread.sleep(1000);

    }




    public static class Stopwatch extends Thread {

        private Runner owner;
        private int stepNumber;     // Номер шага

        public Stopwatch(Runner owner) {
            this.owner = owner;
        }

        @Override
        public void run() {
            while (!isStopped) {
                doStep();
            }
        }

        private void doStep() {
            stepNumber++;
            try {
                Thread.sleep(1000 / owner.getSpeed());
                System.out.println(owner.getName() + " делает " + stepNumber + " шаг");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }




    public static class Runner {

        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.stopwatch = new Stopwatch(this);
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }
}
