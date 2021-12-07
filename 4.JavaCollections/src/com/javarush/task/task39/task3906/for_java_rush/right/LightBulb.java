package com.javarush.task.task39.task3906.for_java_rush.right;

public class LightBulb implements Switchable {
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void turnOff() {
        System.out.println("The light is off!");
        on = false;
    }

    public void turnOn() {
        System.out.println("The light is on!");
        on = true;
    }
}
