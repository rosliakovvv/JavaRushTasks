package com.javarush.task.task37.task3710.for_java_rush.right;

/*
Decorator
*/

import com.javarush.task.task37.task3710.for_java_rush.right.decorators.RedShapeDecorator;
import com.javarush.task.task37.task3710.for_java_rush.right.shapes.Circle;
import com.javarush.task.task37.task3710.for_java_rush.right.shapes.Rectangle;
import com.javarush.task.task37.task3710.for_java_rush.right.shapes.Shape;

public class Solution {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Simple circle");
        circle.draw();

        System.out.println("\nApplied RedShapeDecorator to the circle");
        redCircle.draw();

        System.out.println("\nApplied RedShapeDecorator to the rectangle");
        redRectangle.draw();
    }
}
