package com.javarush.task.task38.task3810.for_java_rush.right;

public @interface Revision {
    int revision();

    Date date();

    Author[] authors() default {};

    String comment() default "";
}
