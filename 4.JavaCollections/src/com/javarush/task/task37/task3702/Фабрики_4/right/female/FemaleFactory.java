package com.javarush.task.task37.task3702.Фабрики_4.right.female;

import com.javarush.task.task37.task3702.Фабрики_4.right.AbstractFactory;
import com.javarush.task.task37.task3702.Фабрики_4.right.Human;

public class FemaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        Human human = null;
        if (age <= KidGirl.MAX_AGE) {
            human = new KidGirl();
        } else if (age <= TeenGirl.MAX_AGE) {
            human = new TeenGirl();
        } else
            human = new Woman();
        return human;
    }
}
