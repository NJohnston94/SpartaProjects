package com.sparta.nathan.stringmethods;

public class SumNumbers {

    /**
     *  Sum even numbers and odd numbers from a hard-coded
     *  array of integers using switch statement in for loop
     */
    public static void sumNumbers(int resolution) {

        int totalEvenValue = 0;
        int totalOddValue = 0;
        int totalValue = 0;
        System.out.println("Sum numbers from 1 to " + resolution);

        for(int i = resolution; i > 0; i--) {

            totalValue += i;

            int checkEvenOdd = (i % 2);
            switch(checkEvenOdd) {
                case 0:
                    totalEvenValue += i;
                    continue;
                case 1:
                    totalOddValue += i;
            }
        }

        System.out.println("Total Value:: " + totalValue);
        System.out.println("Total Even Value:: " + totalEvenValue);
        System.out.println("Total Odd Value:: " + totalOddValue);
    }

}
