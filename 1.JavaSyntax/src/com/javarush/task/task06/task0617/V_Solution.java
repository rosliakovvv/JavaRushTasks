package com.javarush.task.task06.task0617;

public class V_Solution {

    public static void main(String[] args) {
        Idea idea = new Idea();
        printIdea(idea);

    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static class Idea {
        public String getDescription() {
            return "Fuck off";
        }
    }
}
