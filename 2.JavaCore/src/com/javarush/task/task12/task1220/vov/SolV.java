package com.javarush.task.task12.task1220.vov;

public class SolV {
    public static void main(String[] args) {

    }


    public abstract class Human implements CanRun, CanSwim{
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }


}
