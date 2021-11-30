package com.javarush.task.task36.task3608.MVC_1.right.model;

import com.javarush.task.task36.task3608.MVC_1.right.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 23.08.2020.
 */
public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("A",1,1));
        list.add(new User("B",2,2));
        modelData.setUsers(list);
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}