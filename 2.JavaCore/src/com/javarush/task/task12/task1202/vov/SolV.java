package com.javarush.task.task12.task1202.vov;

public class SolV {
    public static void main(String[] args) {
        Scr.Cow cow = new Scr.Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Scr.Cow {
        @Override
        public String getName() {
            return null;
        }
    }
}
