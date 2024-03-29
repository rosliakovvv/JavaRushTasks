//package com.javarush.task.task36.task3608.MVC_1.right.controller;
//
//import com.javarush.task.task36.task3608.MVC_1.right.model.Model;
//import com.javarush.task.task36.task3608.MVC_1.right.view.EditUserView;
//import com.javarush.task.task36.task3608.MVC_1.right.view.UsersView;
//
///**
// * Created by User on 23.08.2020.
// */
//public class Controller {
//    private Model model;
//    private UsersView usersView;
//    private EditUserView editUserView;
//
//    public void onShowAllUsers(){
//        model.loadUsers();
//        usersView.refresh(model.getModelData());
//    }
//    public void onShowAllDeletedUsers() {
//        model.loadDeletedUsers();
//        usersView.refresh(model.getModelData());
//    }
//    public void onOpenUserEditForm(long userId) {
//        model.loadUserById(userId);
//        editUserView.refresh(model.getModelData());
//
//    }
//    public void onUserDelete(long id){
//        model.deleteUserById(id);
//        usersView.refresh(model.getModelData());
//    }
//
//    public void onUserChange(String name, long id, int level){
//        model.changeUserData(name,id,level);
//        usersView.refresh(model.getModelData()); // обновление UserView
//    }
//
//    public Model getModel() {
//        return model;
//    }
//
//    public void setModel(Model model) {
//        this.model = model;
//    }
//
//    public void setUsersView(UsersView usersView) {
//        this.usersView = usersView;
//    }
//
//    public void setEditUserView(EditUserView editUserView) {
//        this.editUserView = editUserView;
//    }
//}
