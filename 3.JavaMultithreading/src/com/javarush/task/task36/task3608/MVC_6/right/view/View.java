package com.javarush.task.task36.task3608.MVC_6.right.view;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);
}
