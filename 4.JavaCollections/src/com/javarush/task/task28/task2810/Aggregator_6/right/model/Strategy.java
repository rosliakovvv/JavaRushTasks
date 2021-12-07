package com.javarush.task.task28.task2810.Aggregator_6.right.model;

import com.javarush.task.task28.task2810.Aggregator_6.right.vo.Vacancy;

import java.util.List;

public interface Strategy {

    List<Vacancy> getVacancies(String searchString);
}
