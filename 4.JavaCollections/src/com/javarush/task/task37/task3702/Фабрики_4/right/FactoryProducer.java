package com.javarush.task.task37.task3702.Фабрики_4.right;

import com.javarush.task.task37.task3702.Фабрики_4.right.female.FemaleFactory;
import com.javarush.task.task37.task3702.Фабрики_4.right.male.MaleFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(HumanFactoryType type) {
        if (type == HumanFactoryType.MALE) {
            return new MaleFactory();
        } else {
            return new FemaleFactory();
        }
    }

    public enum HumanFactoryType {
        MALE,
        FEMALE
    }
}
