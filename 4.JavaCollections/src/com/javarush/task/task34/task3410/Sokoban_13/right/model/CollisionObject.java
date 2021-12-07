package com.javarush.task.task34.task3410.Sokoban_13.right.model;

abstract public class CollisionObject extends com.javarush.task.task34.task3410.Sokoban_12.right.model.GameObject {
    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction) {
        switch (direction) {
            case LEFT:
                return ((x - com.javarush.task.task34.task3410.Sokoban_12.right.model.Model.FIELD_CELL_SIZE) == gameObject.getX()) && (y == gameObject.getY());
            case RIGHT:
                return ((x + com.javarush.task.task34.task3410.Sokoban_12.right.model.Model.FIELD_CELL_SIZE) == gameObject.getX()) && (y == gameObject.getY());
            case UP:
                return ((x == gameObject.getX() && (y - com.javarush.task.task34.task3410.Sokoban_12.right.model.Model.FIELD_CELL_SIZE) == gameObject.getY()));
            case DOWN:
                return ((x == gameObject.getX() && (y + Model.FIELD_CELL_SIZE) == gameObject.getY()));
        }
        return false;
    }
}
