package com.javarush.task.task16.task1610.Расставь_вызовы_методов_join.vov;

public class Test1_1610 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Murka");
        Cat cat2 = new Cat("Muska");
    }

    public static void investigateWorld() {
        try {
            Thread.sleep(500);
            System.out.println("Котенок " + Thread.currentThread().getName() + " гуляет и познает мир");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    public static class Cat extends Thread {

        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Котенок 1 от мамы " + getName());
            kitten2 = new Kitten("Котенок 2 от мамы " + getName());
            start();
        }

        @Override
        public void run() {
            System.out.println(getName() + " родила 2 котят");
            try {
                initAllKittens();
                kitten1.join();
                kitten2.join();
            } catch (InterruptedException e) {

            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKittens() {
            kitten1.start();
            kitten2.start();
        }
    }




    public static class Kitten extends Thread {

        public Kitten(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + ", вылез из коробки");
            investigateWorld();
        }
    }
}
