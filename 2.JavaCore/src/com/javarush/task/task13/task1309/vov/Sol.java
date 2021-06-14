package com.javarush.task.task13.task1309.vov;

public class Sol {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly val);
    }
}

