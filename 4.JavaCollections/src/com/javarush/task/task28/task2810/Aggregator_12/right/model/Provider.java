package com.javarush.task.task28.task2810.Aggregator_12.right.model;


import com.javarush.task.task28.task2810.Aggregator_10.right.model.Strategy;
import com.javarush.task.task28.task2810.Aggregator_10.right.vo.Vacancy;

import java.util.List;

public class Provider {

    private Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString) {
        return strategy.getVacancies(searchString);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
