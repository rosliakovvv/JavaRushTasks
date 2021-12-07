package com.javarush.task.task34.task3410.Sokoban_3.right.controller;

import com.javarush.task.task34.task3410.Sokoban_3.right.model.Model;
import com.javarush.task.task34.task3410.Sokoban_3.right.view.View;

public class Controller {
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
}
