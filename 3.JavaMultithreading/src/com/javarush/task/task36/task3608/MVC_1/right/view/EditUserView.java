//package com.javarush.task.task36.task3608.MVC_1.right.view;
//
//import com.javarush.task.task36.task3608.MVC_1.right.controller.Controller;
//import com.javarush.task.task36.task3608.MVC_1.right.model.ModelData;
//
///**
// * Created by User on 23.08.2020.
// */
//public class EditUserView implements View {
//    private Controller controller;
//    @Override
//    public void refresh(ModelData modelData) {
//        System.out.println("User to be edited:");
//
//            System.out.println("\t"+modelData.getActiveUser());
//
//        System.out.println("===================================================");
//    }
//
//    public void fireEventUserDeleted(long id) {
//        controller.onUserDelete(id);
//    }
//    public void fireEventUserChanged(String name, long id, int level){
//        controller.onUserChange(name, id, level);
//    }
//
//    @Override
//    public void setController(Controller controller) {
//        this.controller = controller;
//    }
//
//}
