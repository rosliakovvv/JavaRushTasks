package com.javarush.task.task34.task3410.Sokoban_10.right.model;

import com.javarush.task.task34.task3410.Sokoban_10.right.model.Box;
import com.javarush.task.task34.task3410.Sokoban_10.right.model.GameObject;
import com.javarush.task.task34.task3410.Sokoban_10.right.model.Home;
import com.javarush.task.task34.task3410.Sokoban_10.right.model.Player;
import com.javarush.task.task34.task3410.Sokoban_10.right.model.Wall;

import java.util.HashSet;
import java.util.Set;

public class GameObjects {
    private Set<Wall> walls;
    private Set<Box> boxes;
    private Set<Home> homes;
    private Player player;

    public GameObjects(Set<Wall> walls, Set<Box> boxes, Set<Home> homes, Player player) {
        this.walls = walls;
        this.boxes = boxes;
        this.homes = homes;
        this.player = player;
    }

    public Set<Wall> getWalls() {
        return walls;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public Set<Home> getHomes() {
        return homes;
    }

    public Player getPlayer() {
        return player;
    }

    public Set<GameObject> getAll() {
        Set<GameObject> gameObjects = new HashSet<>();
        gameObjects.addAll(walls);
        gameObjects.addAll(homes);
        gameObjects.addAll(boxes);
        gameObjects.add(player);
        return gameObjects;
    }
}
