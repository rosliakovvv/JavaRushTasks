package com.javarush.task.task29.task2901.Рефакторинг.right;

/*

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
*/

/*
Рефакторинг в соответствии с Naming and Code Convention
*/


/*
public class Room {
    public static final String DEFAULT_FILE_NAME = "C:/tmp/strange_file_name.tmp";

    private final String localFileName;
    private List<String> contentAsLines;
    private boolean fileLoaded;

    public Room(String firstFileName) {
        localFileName = firstFileName == null ? DEFAULT_FILE_NAME : firstFileName;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = Room.class.getResource("Room.java").getPath();

        Room solution = new Room(fileName);
        solution.downloadFileContent();
        if (solution.isFileLoaded()) {
            System.out.println(solution.hasExpectedLine("public class Room {"));   //expected true
            System.out.println(solution.hasExpectedLine(" public class Room {"));  //expected false
        }
    }

    public boolean isFileLoaded() {
        return fileLoaded;
    }

    public void downloadFileContent() {
        try {
            contentAsLines = Files.readAllLines((new File(localFileName)).toPath(), Charset.defaultCharset());
            fileLoaded = true;
        } catch (IOException e) {
            System.out.println("Unsuccessful. What a surprise!");
        }
    }

    public boolean hasExpectedLine(String expectedLine) {
        return contentAsLines.contains(expectedLine);
    }
}
*/
