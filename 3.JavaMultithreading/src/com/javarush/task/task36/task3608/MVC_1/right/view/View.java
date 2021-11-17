package com.javarush.task.task36.task3608.MVC_1.right.view;

import com.javarush.task.task36.task3608.MVC_1.right.controller.Controller;
import com.javarush.task.task36.task3608.MVC_1.right.model.ModelData;

/**
 * Created by User on 23.08.2020.
 */
public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);


}
