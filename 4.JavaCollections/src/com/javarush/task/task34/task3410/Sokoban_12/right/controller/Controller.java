package com.javarush.task.task34.task3410.Sokoban_12.right.controller;

import com.javarush.task.task34.task3410.Sokoban_12.right.model.Direction;
import com.javarush.task.task34.task3410.Sokoban_12.right.model.GameObjects;
import com.javarush.task.task34.task3410.Sokoban_12.right.model.Model;
import com.javarush.task.task34.task3410.Sokoban_12.right.view.View;

public class Controller implements EventListener {
    private View view;
    private Model model;

    public Controller() {
        model = new Model();
        view = new View(this);

        view.init();
        model.restart();
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

    public GameObjects getGameObjects() {
        return model.getGameObjects();
    }
}
