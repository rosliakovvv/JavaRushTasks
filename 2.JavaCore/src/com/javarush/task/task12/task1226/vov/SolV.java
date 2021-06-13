package com.javarush.task.task12.task1226.vov;

public class SolV {

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun {
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
        @Override
        public void climb() {
            super.climb();
        }

        @Override
        public void run() {
            super.run();
        }
    }

    public class Duck implements CanFly, CanRun {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }
}
