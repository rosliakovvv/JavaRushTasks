package com.javarush.task.task28.task2810.Aggregator_3.right.model;

import com.javarush.task.task28.task2810.Aggregator_3.right.vo.Vacancy;

import java.util.List;

public class Provider {

    private Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString) {
        return null;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
