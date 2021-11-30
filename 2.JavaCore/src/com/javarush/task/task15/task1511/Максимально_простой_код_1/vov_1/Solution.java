package com.javarush.task.task15.task1511.Максимально_простой_код_1.vov_1;

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askVov(" Ты хочешь стать классным программистом?"));
        System.out.println(me.askNast(" Когда ты устроишься на работу"));

    }

    public static class JavaDev {
        String answerQuestion(String question) {
            return String.format("blablabla %s", question);
        }
    }

    public static class JuniorJavaDev {
        JavaDev Vov = new JavaDev();
        JavaDev Nast = new JavaDev();

        String askVov(String questionVov) {
            return Vov.answerQuestion(questionVov);
        }

        String askNast(String questionNast) {
            return Nast.answerQuestion(questionNast);
        }



    }

}
