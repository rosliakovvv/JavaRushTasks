package com.javarush.task.task12.task1215.vov;

public class SolV {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Vasia";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        @Override
        public String getName() {
            return "Tusik";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }

}
