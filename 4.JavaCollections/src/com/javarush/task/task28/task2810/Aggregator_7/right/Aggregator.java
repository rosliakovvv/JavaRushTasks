package com.javarush.task.task28.task2810.Aggregator_7.right;

import com.javarush.task.task28.task2810.Aggregator_5.right.model.HHStrategy;
import com.javarush.task.task28.task2810.Aggregator_5.right.model.Provider;
import com.javarush.task.task28.task2810.Aggregator_6.right.Controller;

public class Aggregator {

    public static void main(String[] args) {
        Provider provider = new Provider(new HHStrategy());
        Controller controller = new Controller(provider);
        controller.scan();
    }
}
