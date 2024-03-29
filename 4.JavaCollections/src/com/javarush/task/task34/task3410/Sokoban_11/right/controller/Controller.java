package com.javarush.task.task34.task3410.Sokoban_11.right.controller;

import com.javarush.task.task34.task3410.Sokoban_11.right.controller.EventListener;
import com.javarush.task.task34.task3410.Sokoban_11.right.model.Direction;
import com.javarush.task.task34.task3410.Sokoban_11.right.model.Model;
import com.javarush.task.task34.task3410.Sokoban_11.right.view.View;

public class Controller implements EventListener {
    private View view;
    private Model model;

    public Controller() {
        model = new Model();
        view = new View(this);

        view.init();
    }

    public static void main(String[] args) {
        new Controller();
    }

    @Override
    public void move(Direction direction) {
    }

    @Override
    public void restart() {
    }

    @Override
    public void startNextLevel() {
    }

    @Override
    public void levelCompleted(int level) {
    }
}
