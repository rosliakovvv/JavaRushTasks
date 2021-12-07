package com.javarush.task.task38.task3810.for_java_rush.right;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface Changelog {
    Revision[] value() default {};
}
