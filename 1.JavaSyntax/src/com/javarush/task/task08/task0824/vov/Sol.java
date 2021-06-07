package com.javarush.task.task08.task0824.vov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol {
    public static void main(String[] args) {

        Human daughter = new Human("Daughter", false, 15);
        Human daughterYoung = new Human("DaughterYoung", false, 17);
        Human son = new Human("Son", true, 12);

        Human mom = new Human("Mom", false, 45, daughter, daughterYoung,son);
        Human dad = new Human("Dad", true, 50,  daughter, daughterYoung,son);

        Human grandMa1 = new Human("MomMom", false, 80,mom);
        Human grandPa1 = new Human("DadMom", true, 85, mom);

        Human grandMa2 = new Human("MomDad", false, 82, dad);
        Human grandPa2 = new Human("DadDad", true, 87, dad);

        System.out.println(daughter);
        System.out.println(daughterYoung);
        System.out.println(son);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(grandMa1);
        System.out.println(grandPa1);
        System.out.println(grandMa2);
        System.out.println(grandPa2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;

        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children, children);

        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "man" : "woman");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
