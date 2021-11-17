package com.javarush.task.task36.task3608.MVC_1.right.model;

import com.javarush.task.task36.task3608.MVC_1.right.bean.User;

import java.util.List;

/**
 * Created by User on 23.08.2020.
 */
public class ModelData {
    private User activeUser;
    private List<User> users;
    private boolean displayDeletedUserList;

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }
}
