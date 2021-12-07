package com.javarush.task.task36.task3601.for_java_rush.right;

import java.util.List;

public class Controller {
    private Model model = new Model();

    public List<String> onShowDataList() {
        return model.getStringDataList();
    }
}
