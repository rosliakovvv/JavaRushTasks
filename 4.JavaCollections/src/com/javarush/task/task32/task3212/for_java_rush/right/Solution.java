package com.javarush.task.task32.task3212.for_java_rush.right;


/*
Service Locator
*/

import com.javarush.task.task32.task3212.for_java_rush.right.service.Service;

public class Solution {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();

    }

}
