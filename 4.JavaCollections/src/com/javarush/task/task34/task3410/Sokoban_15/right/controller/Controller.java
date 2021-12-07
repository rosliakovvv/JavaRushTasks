package com.javarush.task.task34.task3410.Sokoban_15.right.controller;

import com.javarush.task.task34.task3410.Sokoban_15.right.controller.EventListener;
import com.javarush.task.task34.task3410.Sokoban_15.right.model.Direction;
import com.javarush.task.task34.task3410.Sokoban_15.right.model.GameObjects;
import com.javarush.task.task34.task3410.Sokoban_15.right.model.Model;
import com.javarush.task.task34.task3410.Sokoban_15.right.view.View;

public class Controller implements EventListener {
    private View view;
    private Model model;

    public Controller() {
        model = new Model();
        view = new View(this);

        view.init();
        model.restart();

        model.setEventListener(this);
        view.setEventListener(this);
    }

    public static void main(String[] args) {
        new Controller();
    }

    @Override
    public void move(Direction direction) {
        model.move(direction);
        view.update();
    }

    @Override
    public void restart() {
        model.restart();
        view.update();
    }

    @Override
    public void startNextLevel() {
        model.startNextLevel();
        view.update();
    }

    @Override
    public void levelCompleted(int level) {
        view.completed(level);
    }

    public GameObjects getGameObjects() {
        return model.getGameObjects();
    }
}
