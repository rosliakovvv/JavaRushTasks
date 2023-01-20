package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        String result = "";
        int i = 0;


        // Не понял зачем эта строчка, может быть JR просто показывает что еще может быть ))
        public Read3Strings() {
            super();
        }

        @Override
        public void run() {
            for(;i<3;){
                try {
                   // if(reader.ready()){
                        result = result + reader.readLine() + " ";
                        i++;
                 //   }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printResult() {
            System.out.println(this.result);
        }
    }
       /* ArrayList<String> result = new ArrayList<>();
        private int count=0;

        public void run() {
            try {
                while (count < 3)
                    if (reader.ready()) {
                        result.add(reader.readLine()+" ");
                        count++;
                   }

            } catch (IOException e) {}
        }

        public void printResult() {
            for (String tx:result
                 ) {
                System.out.print(tx);
            }
            System.out.println("");
        }
    }*/
    //add your code here - добавьте код тут
}
