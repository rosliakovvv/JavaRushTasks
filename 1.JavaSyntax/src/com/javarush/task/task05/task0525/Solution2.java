package com.javarush.task.task05.task0525;

public class Solution2 {
    Putin putin = new Putin();



    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.putin.toString());

    }



    public class Putin {

        @Override
        public String toString() {
            return "Это не мой дворец";
        }
    }

}
