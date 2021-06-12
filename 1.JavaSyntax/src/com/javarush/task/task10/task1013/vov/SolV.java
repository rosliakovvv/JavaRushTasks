package com.javarush.task.task10.task1013.vov;

public class SolV {
    public static void main(String[] args) {

    }

    public static class Human {
        private int age;
        private int weight;
        private int height;
        private String sex;
        private String color;
        private String children;

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, int weight, int height, String sex) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(int age, int weight, int height, String sex, String color) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
            this.color = color;
        }

        public Human(int age, int weight, int height, String sex, String color, String children) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
            this.color = color;
            this.children = children;
        }

        public Human(String children) {
            this.children = children;
        }

        public Human(String color, String children) {
            this.color = color;
            this.children = children;
        }

        public Human(String sex, String color, String children) {
            this.sex = sex;
            this.color = color;
            this.children = children;
        }

        public Human(int height, String sex, String color, String children) {
            this.height = height;
            this.sex = sex;
            this.color = color;
            this.children = children;
        }
    }


}
