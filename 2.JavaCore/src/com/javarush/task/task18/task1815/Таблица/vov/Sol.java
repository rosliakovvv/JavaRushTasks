package com.javarush.task.task18.task1815.Таблица.vov;

import java.util.List;

public class Sol {

    public class TableInterfaceWrapper implements TableInterface {

        TableInterface tableInter;

        public TableInterfaceWrapper(TableInterface tableInter) {
            this.tableInter = tableInter;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInter.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInter.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInter.setHeaderText(newHeaderText);
        }
    }



    public interface TableInterface {

        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }


}
