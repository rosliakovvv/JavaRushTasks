package com.javarush.task.task18.task1825.Собираем_файл.test;

import java.util.Comparator;
import java.util.TreeSet;

public class TestCompare2 {

    public static void main(String[] args) {

        PersonNameComparator pnc = new PersonNameComparator();
        PersonAgeComparator pac = new PersonAgeComparator();
        TreeSet<Person> people = new TreeSet<>(pnc.thenComparing(pac));

        people.add(new Person("Tom", 65));
        people.add(new Person("Nick", 54));
        people.add(new Person("Vov", 34));
        people.add(new Person("Tom", 66));
        people.add(new Person("Bill",23));

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }



    }

    public static class PersonNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            // Тут просто сравниваются строки
            return o1.getName().compareTo(o2.getName());
        }
    }


    public static class PersonAgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            if (o1.getAge() < o2.getAge()) return -1;
            else if (o1.getAge() > o2.getAge()) return 1;
            else return 0;
        }
    }



    private static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}

