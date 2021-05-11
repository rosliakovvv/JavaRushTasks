package com.javarush.task.task05.task0526;

public class Solution2 {

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Man{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Woman{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Man man1 = new Man("Pitr", 29, "Lenina");
        Man man2 = new Man("Sema", 31, "Lenina");

        Woman woman1 = new Woman("Sveta", 25, "Stalina");
        Woman woman2 = new Woman("Toma", 23, "Stalina");

        System.out.println(man1);
        System.out.println(man2);

        System.out.println(woman1);
        System.out.println(woman2);
    }
}
