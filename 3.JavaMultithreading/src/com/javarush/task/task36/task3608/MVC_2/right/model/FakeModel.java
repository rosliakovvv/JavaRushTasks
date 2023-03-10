package com.javarush.task.task36.task3608.MVC_2.right.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {

    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("A", 1l, 1));
        users.add(new User("B", 2l, 1));
        modelData.setUsers(users);
    }
}
