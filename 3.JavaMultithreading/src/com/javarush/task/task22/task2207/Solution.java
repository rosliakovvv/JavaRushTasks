package com.javarush.task.task22.task2207;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        /*try (BufferedReader readerFile = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(readerFile.readLine())) ){

            String stringReader = null;
            List<String> strings = new ArrayList<>();
            Pair pair = new Pair();
            while (reader.ready()){
                stringReader = reader.readLine();
                Collections.addAll(strings, stringReader.split(" "));
              System.out.println(strings);
            }

            for (int i = 0; i < strings.size(); i++) {
               // for (int j = 0; j <strings.size() ; j++) {
                    if(strings.get(i)==null) continue;
                    StringBuilder sB = new StringBuilder(strings.get(i)).reverse();
                    System.out.println(sB);
                   if (sB.toString().equals(strings.get(i))){
                       pair.first = strings.get(i);
                       System.out.println("pair.first "+ pair.first);
                       pair.second = sB.toString();
                       System.out.println("pair.second "+pair.second);
                       result.add(pair);
                      // strings.set(i, null);
                     //  strings.set(j, null);
                   }
              //  }


            }
            System.out.println("=======");
            System.out.println(result);
            for (Pair p:result
                 ) {
                System.out.println(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        ArrayList<String> ss = new ArrayList<>();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(reader1.readLine()));
        Pair pp;
        while (reader.ready())
        {
            ss.addAll(Arrays.asList(reader.readLine().split(" ")));
        }
        for (int i = 0; i < ss.size(); i++)
            for (int j = 0; j < ss.size();j++)
            {
                if (ss.get(i)==null || ss.get(j)==null) continue;
                StringBuilder sb = new StringBuilder(ss.get(i)).reverse();
                pp = new Pair();

                if (sb.toString().equals(ss.get(j)) && i != j)
                {
                    pp.first = ss.get(i);
                    pp.second = ss.get(j);
                    result.add(pp);
                    ss.set(i,null);
                    ss.set(j,null);
                }
            }
        reader.close();
        reader1.close();
        for (Pair p:result
             ) {
            System.out.println(p);
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair(){}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
