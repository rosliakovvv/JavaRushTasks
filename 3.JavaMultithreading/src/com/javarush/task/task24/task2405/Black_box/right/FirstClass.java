package com.javarush.task.task24.task2405.Black_box.right;

public abstract class FirstClass implements Action {     //first implementation

    protected FirstClass() {
        Solution.countActionObjects++;
    }

    public void someAction() {
        System.out.println("class FirstClass, method someAction");
    }

    public abstract Action getDependantAction();
}
