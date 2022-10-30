package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        //declare evenString
        String evenString = "";

        //for loop start to stop int. Do not include the stop int in the string
        for (int i = start; i < stop; i++) {
            //if even
            if (i % 2 == 0) {
                System.out.println(i);
                //convert number to char or string
                evenString = evenString + Integer.toString(i);
            }
        }

        return evenString;

    }




    public static String getOddNumbers(int start, int stop) {
        //declare oddString
        String oddString = "";

        //for loop start to stop int. Do not include the stop int in the string
        for (int i = start; i < stop; i++) {
            //if odd
            if (i % 2 != 0) {
                System.out.println(i);
                //convert number to string
                oddString = oddString + Integer.toString(i);
            }
        }

        return oddString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        //declare oddString
        String squareString = "";
        int squaredNumber;


        //for loop start to stop int and go up by step variable
        for (int i = start; i < stop; i += step) {
                squaredNumber = i * i;
                //convert number to string and square the number
                squareString = squareString + Integer.toString(squaredNumber);
        }

        System.out.println(squareString);
        return squareString;
    }

    public static String getRange(int stop) {
        String rangeString = "";

        for (int i = 0; i < stop; i++) {
            rangeString = rangeString + Integer.toString(i);
        }

        return rangeString;
    }

    public static String getRange(int start, int stop) {
        String rangeString = "";

        for (int i = start; i < stop; i++) {
            rangeString = rangeString + Integer.toString(i);
        }

        return rangeString;
    }


    public static String getRange(int start, int stop, int step) {
        String rangeString = "";
        int stepNum;

        //for loop start to stop int and go up by step
        for (int i = start; i < stop; i += step) {
            stepNum = i;
            rangeString = rangeString + Integer.toString(stepNum);
        }

        System.out.println(rangeString);
        return rangeString;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expo = "";
        int num;

        for (int i = start; i < stop; i += step) {
            num = (int) Math.pow(i, exponent);

            expo = expo + Integer.toString(num);

        }
        System.out.println(expo);
        return expo;
    }
}
