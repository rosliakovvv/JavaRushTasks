package com.javarush.task.task19.task1901.TableAdapter.right;

/*
TableAdapter
*/


public class Solution {

    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {

        // idea просит сделать final, наверно чтобы только один раз можно было подключиться.
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
