package com.javarush.task.task36.task3601.for_java_rush.right;

import java.util.List;

public class Model {
    private Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }

}
