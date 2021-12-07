package com.javarush.task.task36.task3601;

import java.util.ArrayList;
import java.util.List;

/* 
MVC - простая версия
*/

public class Solution {
    public static void main(String[] args) {
       // new Space().fireShowDataEvent();
        View view = new View();
        view.fireShowDataEvent();
    }

   /* public List<String> getData() { // server
        List<String> data = new ArrayList<String>() {{
            add("First string");
            add("Second string");
            add("Third string");
        }};
        return data;
    }

    public void fireShowDataEvent() {
        System.out.println(onShowDataList());
    } // view

    public List<String> getStringDataList() {
        return getData();
    } // model

    public List<String> onShowDataList() {
        return getStringDataList();
    } //  collector*/
}
