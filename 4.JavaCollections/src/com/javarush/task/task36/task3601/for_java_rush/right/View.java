package com.javarush.task.task36.task3601.for_java_rush.right;

public class View {
    private Controller controller = new Controller();

    public void fireShowDataEvent() {
        System.out.println(controller.onShowDataList());
    }
}
