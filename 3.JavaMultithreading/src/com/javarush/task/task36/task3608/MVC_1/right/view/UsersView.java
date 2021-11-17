package com.javarush.task.task36.task3608.MVC_1.right.view;

import com.javarush.task.task36.task3608.MVC_1.right.bean.User;
import com.javarush.task.task36.task3608.MVC_1.right.controller.Controller;
import com.javarush.task.task36.task3608.MVC_1.right.model.ModelData;

/**
 * Created by User on 23.08.2020.
 */
public class UsersView implements View {
    private Controller controller;

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }


    @Override
    public void refresh(ModelData modelData) {

        if (!modelData.isDisplayDeletedUserList()) {
            System.out.println("All users:");
        } else {
            System.out.println("All deleted users:");
        }
        for (User user : modelData.getUsers()
                ) {
            System.out.println("\t" + user.toString());
        }
        System.out.println("===================================================");


    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
