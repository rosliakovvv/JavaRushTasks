package com.javarush.task.task25.task2515.Space_13.right;

/**
 * Класс для бомбы.
 */
public class Bomb extends BaseObject {
    public Bomb(double x, double y) {
        super(x, y, 1);
    }

    /**
     * Отрисовываем себя на холсте.
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'B');
    }

    /**
     * Двигаем себя вниз на file1.txt ход.
     */
    @Override
    public void move() {
        y++;
    }
}
