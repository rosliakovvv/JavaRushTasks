package com.javarush.task.task11.task1110.vov;

public class SolV {
    public static void main(String[] args) {
    }

    public class CatV {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public CatV(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
}
