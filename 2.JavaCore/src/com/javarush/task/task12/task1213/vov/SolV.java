package com.javarush.task.task12.task1213.vov;

public class SolV {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }

}
