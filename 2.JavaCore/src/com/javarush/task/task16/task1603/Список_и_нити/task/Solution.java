package com.javarush.task.task16.task1603.Список_и_нити.task;

import java.util.ArrayList;
import java.util.List;

/*
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишите тут ваш код
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread_v4");
        }
    }
}
