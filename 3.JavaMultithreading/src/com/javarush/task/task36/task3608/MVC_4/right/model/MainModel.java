package com.javarush.task.task36.task3608.MVC_4.right.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {

    //use helpful services
    private UserService userService = new UserServiceImpl();

    //use special object to keep data for view rendering
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = userService.getUsersBetweenLevels(1, 100);
        //refresh model data
        modelData.setUsers(users);
    }
}
