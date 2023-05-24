package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Manager {

    //singleton
    private static Manager ourInstance = new Manager();

    private final List<Table> restaurantTables = new ArrayList<Table>(10);
    private int currentIndex = 0;

    private final Queue<Order> orderQueue = new ConcurrentLinkedQueue<Order>();   // очередь с заказами
    private final Queue<Dishes> dishesQueue = new ConcurrentLinkedQueue<Dishes>();     // очередь с готовыми блюдами

    public synchronized static Manager getInstance() {
        return ourInstance;
    }

    // создаем 10 столов при создании менеджера, а потом может только добавлять -V
    private Manager() {
        for (int i = 0; i < 10; i++) {
            restaurantTables.add(new Table());
        }
    }

    // официант ходит по кругу от 1 стола к 10
    public synchronized Table getNextTable() {
        Table table = restaurantTables.get(currentIndex);
        currentIndex = (currentIndex + 1) % 10;
        return table;
    }

    // Менеджер знает обо всех заказах и о готовых блюдах
    public Queue<Order> getOrderQueue() {
        return orderQueue;
    }
    public Queue<Dishes> getDishesQueue() {
        return dishesQueue;
    }
}
