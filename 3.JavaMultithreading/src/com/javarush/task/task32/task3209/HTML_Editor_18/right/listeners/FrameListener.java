package com.javarush.task.task32.task3209.HTML_Editor_18.right.listeners;

import com.javarush.task.task32.task3209.HTML_Editor_18.right.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter {
    private View view;

    public FrameListener(View view) {
        this.view = view;
    }

    public void windowClosing(WindowEvent windowEvent) {
        view.exit();
    }
}
