package com.javarush.task.task21.task2113.Ипподром_6.right;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Lucky", 3, 0));
        horses.add(new Horse("Slevin", 3, 0));
        horses.add(new Horse("Homer", 3, 0));
        game = new Hippodrome(horses);
    }
}
