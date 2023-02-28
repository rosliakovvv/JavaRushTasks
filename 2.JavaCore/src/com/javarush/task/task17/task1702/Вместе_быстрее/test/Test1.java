package com.javarush.task.task17.task1702.Вместе_быстрее.test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
