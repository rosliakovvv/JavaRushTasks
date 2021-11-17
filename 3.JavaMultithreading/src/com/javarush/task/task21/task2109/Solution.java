package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            throw  new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            C cClone = new C(this.getI(), this.getJ(), this.getName());
            return cClone;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        B b1 = new B(1,2,"B");
//        B b2 = (B) b1.clone();
        C c1 = new C(1,2,"C");
        C c2 = (C) c1.clone();
        System.out.println(c1);
        System.out.println(c2);
    }
}
