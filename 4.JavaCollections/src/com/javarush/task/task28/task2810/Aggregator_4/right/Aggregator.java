package com.javarush.task.task28.task2810.Aggregator_4.right;

import com.javarush.task.task28.task2810.Aggregator_2.right.model.Provider;

public class Aggregator {

    public static void main(String[] args) {
        Provider provider = new Provider(null);
        Controller controller = new Controller(provider);
        System.out.println(controller);
    }
}
