package com.javarush.task.task39.task3906.for_java_rush.right;

public class ElectricPowerSwitch {
    private Switchable switchable;

    public ElectricPowerSwitch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void press() {
        System.out.println("Power switch flipped.");
        if (switchable.isOn()) {
            switchable.turnOff();
        } else {
            switchable.turnOn();
        }
    }
}
