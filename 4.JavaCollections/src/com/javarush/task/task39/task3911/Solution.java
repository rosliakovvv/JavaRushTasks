package com.javarush.task.task39.task3911;

import com.javarush.task.task39.task3911.for_java_rush.right.Software;

import java.util.Map;

/* 
Rollback
*/

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        Software software = new Software();
        for (int i = 1; i < 7; i++) {
            software.addNewVersion(i, "Description of version #" + i);
        }

        System.out.println("Printing all versions ");
        for (Map.Entry entry : software.getVersionHistoryMap().entrySet()) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }
        System.out.println("The current version is " + software.getCurrentVersion());

        System.out.println("ROLLING BACK to version " + n);
        software.rollback(n);

        System.out.println("\nPrinting all versions ");
        for (Map.Entry entry : software.getVersionHistoryMap().entrySet()) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }
        System.out.println("The current version is " + software.getCurrentVersion());
    }
}
