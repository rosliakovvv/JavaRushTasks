package com.javarush.task.task19.task1901.TableAdapter.vov;

public class Sol {

    public static void main(String[] args) {

        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Vov";
            }

            @Override
            public String getTableName() {
                return "My table";
            }
        };

        BTable table = new TableAdapter(aTable);

        System.out.println(table.getHeaderText());



    }

    public static class TableAdapter implements BTable {

        private ATable aTable;

        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        @Override
        public String getHeaderText() {
            return String.format("[%s] : %s", aTable.getCurrentUserName(), aTable.getTableName());
        }
    }


    public interface ATable {

        String getCurrentUserName();

        String getTableName();
    }


    public interface BTable {

        String getHeaderText();
    }
}
