package com.javarush.task.task28.task2810.Aggregator_10.right.view;

import com.javarush.task.task28.task2810.Aggregator_9.right.Controller;
import com.javarush.task.task28.task2810.Aggregator_9.right.view.View;
import com.javarush.task.task28.task2810.Aggregator_9.right.vo.Vacancy;

import java.util.List;

public class HtmlView implements View {

    private Controller controller;

    @Override
    public void update(List<Vacancy> vacancies) {

    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
