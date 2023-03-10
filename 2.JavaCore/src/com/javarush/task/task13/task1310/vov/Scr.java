package com.javarush.task.task13.task1310.vov;

public class Scr {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary {
    }

    interface Boss {
    }

    class Manager {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
