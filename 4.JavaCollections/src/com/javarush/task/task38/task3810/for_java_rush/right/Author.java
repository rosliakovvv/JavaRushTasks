package com.javarush.task.task38.task3810.for_java_rush.right;

public @interface Author {
    String value();

    Position position() default Position.OTHER;
}
