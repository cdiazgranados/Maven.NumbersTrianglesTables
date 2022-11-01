package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int multiple;
        String smallTable = "";


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                multiple = i * j;
                if (j == 6) {
                    smallTable = smallTable + "\n";
                } else if (multiple < 10) {
                    smallTable = smallTable + "  " + Integer.toString(multiple) + " " + "|";
                } else {
                    smallTable = smallTable + " " + Integer.toString(multiple) + " " + "|";
                }
            }
        }
        System.out.println(smallTable);
        return smallTable;
    }

    public static String getLargeMultiplicationTable() {
        int multiple;
        String largeTable = "";


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 11; j++) {
                multiple = i * j;
                if (j == 11) {
                    largeTable = largeTable + "\n";
                } else if (multiple < 10) {
                    largeTable = largeTable + "  " + Integer.toString(multiple) + " " + "|";
                } else if (multiple >= 100){
                    largeTable = largeTable + Integer.toString(multiple) + " " + "|";
                } else {
                    largeTable = largeTable + " " + Integer.toString(multiple) + " " + "|";
                }
            }
        }
        System.out.println(largeTable);
        return largeTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        int multiple;
        String table = "";


        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 21; j++) {
                multiple = i * j;
                if (j == 21) {
                    table = table + "\n";
                } else if (multiple < 10) {
                    table = table + "  " + Integer.toString(multiple) + " " + "|";
                } else if (multiple >= 100){
                    table = table + Integer.toString(multiple) + " " + "|";
                } else {
                    table = table + " " + Integer.toString(multiple) + " " + "|";
                }
            }
        }
        System.out.println(table);
        return table;
    }
}
