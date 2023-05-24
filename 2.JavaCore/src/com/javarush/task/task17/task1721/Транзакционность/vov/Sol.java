package com.javarush.task.task17.task1721.Транзакционность.vov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol {

    public static List<String> listAll = new ArrayList<String>();
    public static List<String> listDel = new ArrayList<String>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1;
        String name2;

        String end1;
        String end2;

        try {

            end1 = reader.readLine();
            end2 = reader.readLine();

            name1 = "2.JavaCore/src/com/javarush/task/task17/task1721/Транзакционность/vov/" + end1 + ".txt";
            name2 = "2.JavaCore/src/com/javarush/task/task17/task1721/Транзакционность/vov/" + end2 + ".txt";

            BufferedReader readerIN = new BufferedReader(new FileReader(name1));

            String inPut;
            while ((inPut = readerIN.readLine()) != null)
                listAll.add(inPut);
            readerIN.close();

            BufferedReader readerOUT = new BufferedReader(new FileReader(name2));

            String outPut;
            while ((outPut = readerOUT.readLine()) != null)
                listDel.add(outPut);
            readerOUT.close();

            System.out.println(listAll);
            System.out.println(listDel);

            new Sol().joinF();

            System.out.println(listAll);
            System.out.println(listDel);


        } catch (Exception ignore) {

        }
    }

    public void joinF() throws FException {
        if (listAll.containsAll(listDel)) {
            listAll.removeAll(listDel);
        } else {
            listAll.clear();
            throw new FException();
        }
    }
}
