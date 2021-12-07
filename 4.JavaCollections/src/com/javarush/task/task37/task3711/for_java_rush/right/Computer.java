package com.javarush.task.task37.task3711.for_java_rush.right;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void run() {
        cpu.calculate();
        memory.allocate();
        hardDrive.storeData();
    }
}
