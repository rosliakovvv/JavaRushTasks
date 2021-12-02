package com.javarush.task.task36.task3608.MVC_7.right.model;

public interface Model {

    ModelData getModelData();

    void loadUsers();

    void loadDeletedUsers();

    void loadUserById(long userId);
}
