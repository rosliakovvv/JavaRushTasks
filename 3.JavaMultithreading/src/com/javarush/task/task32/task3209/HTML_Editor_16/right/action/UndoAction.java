package com.javarush.task.task32.task3209.HTML_Editor_16.right.action;

import com.javarush.task.task32.task3209.HTML_Editor_16.right.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UndoAction extends AbstractAction {
    private View view;

    public UndoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
