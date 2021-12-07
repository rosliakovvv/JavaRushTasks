package com.javarush.task.task28.task2810.Aggregator_5.right.model;

import com.javarush.task.task28.task2810.Aggregator_5.right.vo.Vacancy;

import java.util.ArrayList;
import java.util.List;

public class HHStrategy implements Strategy {

    private static final String URL_FORMAT = "https://hh.ru/search/vacancy?text=java+%s&page=%d";

    @Override
    public List<Vacancy> getVacancies(String searchString) {
        return new ArrayList<>();
    }
}
