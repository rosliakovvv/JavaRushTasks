package com.javarush.task.task13.task1309.vov;

public class SolV {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove{
        Double speed();
    }

    public interface CanFly extends CanMove{

        Double speed(CanFly cf);
    }

}