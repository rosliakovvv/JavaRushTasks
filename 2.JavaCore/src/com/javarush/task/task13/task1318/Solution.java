package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(stroka);

        while (fileInputStream.available()>0) {

            System.out.print((char)fileInputStream.read());
        }
        reader.close();
        fileInputStream.close();
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        InputStream inStream = new FileInputStream(str);
        while (inStream.available()>0){
            if(str.isEmpty()){
                break;
            }
            int data = inStream.read();
            char chars = (char) data;
            System.out.print(chars);
            //System.out.println(data);

        }*/

        /*BufferedReader bif = new BufferedReader(new InputStreamReader(inStream));
        while (bif.ready()){
            System.out.println(bif.readLine());
        }*/
       // inStream.close();
        //reader.close();
        //bif.close();

    }
}