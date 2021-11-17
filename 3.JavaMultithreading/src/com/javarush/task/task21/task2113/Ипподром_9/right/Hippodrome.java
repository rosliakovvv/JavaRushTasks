package com.javarush.task.task21.task2113.Ипподром_9.right;


import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    void print() {

    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Lucky", 3, 0));
        game.getHorses().add(new Horse("Slevin", 3, 0));
        game.getHorses().add(new Horse("Homer", 3, 0));
    }
}
