package com.javarush.task.task32.task3212.for_java_rush.right.service.impl;

import com.javarush.task.task32.task3212.for_java_rush.right.service.Service;

public class EJBServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing EJBService");
    }

    @Override
    public String getName() {
        return "EJBService";
    }

}
