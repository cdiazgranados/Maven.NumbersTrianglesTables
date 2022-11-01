package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                if (j > i) {
                    triangle = triangle + "\n";
                    break;
                } else {
                    triangle = triangle + "*";
                }
            }
        }
        System.out.println(triangle);

        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 0; i < 20; i++) {
            row += "*";
        }
        return row;
    }

    public static String getSmallTriangle() {
        String triangle = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j > i) {
                    triangle = triangle + "\n";
                    break;
                } else {
                    triangle = triangle + "*";
                }
            }
        }
        System.out.println(triangle);

        return triangle;
    }

    public static String getLargeTriangle() {
        String triangle = "";

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j > i) {
                    triangle = triangle + "\n";
                    break;
                } else {
                    triangle = triangle + "*";
                }
            }
        }
        System.out.println(triangle);

        return triangle;
    }
}
