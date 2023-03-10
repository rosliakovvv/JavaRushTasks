package com.javarush.task.task28.task2810.Aggregator_10.right;

import com.javarush.task.task28.task2810.Aggregator_5.right.model.Provider;
import com.javarush.task.task28.task2810.Aggregator_5.right.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    private Provider[] providers;

    public Controller(Provider... providers) {
        if (providers.length == 0) throw new IllegalArgumentException();
        this.providers = providers;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }

    public void scan() {
        List<Vacancy> vacancies = new ArrayList<>();
        for (Provider provider : providers) {
            vacancies.addAll(provider.getJavaVacancies("MyTown"));
        }
        System.out.println(vacancies.size());
    }
}
