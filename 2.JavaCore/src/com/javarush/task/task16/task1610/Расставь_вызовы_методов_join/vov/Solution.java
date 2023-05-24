package com.javarush.task.task16.task1610.Расставь_вызовы_методов_join.vov;

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }

    // Познает мир, после того как вылез из корзинки )
    private static void investigateWorld() {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " - познает мир");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    public static class Cat extends Thread {

        protected Kitten kitten1;
        protected Kitten kitten2;


        // У каждой кошки по file2.txt котенка
        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Котенок 1, мама - " + getName());
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            start();
        }

        public void run() {
            System.out.println(getName() + " родила 2 котят");
            try {
                initAllKittens();
                // Ждем когда оба познают мир
                kitten1.join();
                kitten2.join();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        // Показать котят )
        // Выпускаем сразу обоих
        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();
        }
    }




    public static class Kitten extends Thread {

        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", вылез из корзинки");
            investigateWorld();
        }
    }
}

