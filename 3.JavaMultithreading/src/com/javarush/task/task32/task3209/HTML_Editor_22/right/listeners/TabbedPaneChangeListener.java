package com.javarush.task.task32.task3209.HTML_Editor_22.right.listeners;

import com.javarush.task.task32.task3209.HTML_Editor_22.right.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener {
    private View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
