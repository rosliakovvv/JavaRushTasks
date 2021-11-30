package com.javarush.task.task29.task2902.Рефакторинг2.right;
/*
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
*/

/*
Рефакторинг в соответствии с Naming and Code Convention 2
*/

/*
public class Room {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        Room solution = new Room();
        String nameOfFileToBeOpenedByNotepad = solution.getAbsolutePathToDefaultTxtFile().toString();
        Process notepad = solution.getStartNotepadProcess(nameOfFileToBeOpenedByNotepad);
        notepad.waitFor();
    }

    public Process getStartNotepadProcess(String fileName) throws IOException {
        String[] cmdArray = new String[]{"notepad.exe", fileName};
        return Runtime.getRuntime().exec(cmdArray);
    }

    public Path getAbsolutePathToDefaultTxtFile() throws URISyntaxException {
        URI uri = Room.class.getResource("file.txt").toURI();
        return Paths.get(uri);
    }
}
*/
