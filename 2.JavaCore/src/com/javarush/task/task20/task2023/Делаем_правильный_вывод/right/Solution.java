package com.javarush.task.task20.task2023.Делаем_правильный_вывод.right;

/*
Делаем правильный вывод
*/
//
//public class Solution {
//    public static void main(String[] s) {
//        A aNew = new C();
//        aNew.method2();
//    }
//
//    public static class A {
//        private void method1() {
//            System.out.println("A class, method1");
//        }
//
//        public void method2() {
//            System.out.println("A class, method2");
//            method1();
//        }
//    }
//
//    public static class B extends A {
//        public void method1_new() {
//            super.method2();
//            System.out.println("B class, method1");
//        }
//
//        public void method2() {
//            System.out.println("B class, method2");
//        }
//    }
//
//    public static class C extends B {
//        public void method1_new() {
//            System.out.println("C class, method1");
//        }
//
//        public void method2() {
//            System.out.println("C class, method2");
//            super.method1();     //+
//        }
//    }
//}
