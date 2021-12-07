package com.javarush.task.task28.task2810.Aggregator_9.right.view;


import com.javarush.task.task28.task2810.Aggregator_9.right.Controller;
import com.javarush.task.task28.task2810.Aggregator_9.right.vo.Vacancy;

import java.util.List;

public interface View {

    void update(List<Vacancy> vacancies);

    void setController(Controller controller);
}
