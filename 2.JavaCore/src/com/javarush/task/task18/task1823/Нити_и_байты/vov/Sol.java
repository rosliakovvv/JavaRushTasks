package com.javarush.task.task18.task1823.Нити_и_байты.vov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sol {

    public static Map<String, Integer> resMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String readStr;

        while (!(readStr = reader.readLine()).equals("exit")) {
            new RThread(readStr).start();
        }

        for (Map.Entry<String, Integer> item : resMap.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }

    public static class RThread extends Thread {

        String fileName;

        public RThread(String readStr) {
            this.fileName = "2.JavaCore/src/com/javarush/task/task18/task1823/Нити_и_байты/right/" + readStr + ".txt";
        }

        @Override
        public void run() {

            int[] bytesCount = new int[256];

            try (FileInputStream fis = new FileInputStream(fileName)) {

                while (fis.available() > 0) {
                    int aByte = fis.read();
                    bytesCount[aByte]++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            int maxCount = 0;
            int maxCountByte = 0;

            for (int i = 0; i < bytesCount.length; i++) {
                if (bytesCount[i] > maxCount) {
                    maxCount = bytesCount[i];
                    maxCountByte = i;
                }
            }

            resMap.put(fileName, maxCountByte);
        }
    }
}
