package com.javarush.task.task12.task1201.vov;

public class SolV {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {

        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {

        @Override
        public String getName() {
            return "я не корова - я кит, потому что какой то дебил написал эту задачу";
        }
    }
}
