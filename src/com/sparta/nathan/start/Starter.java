package com.sparta.nathan.start;

import com.sparta.nathan.messages.MessagePrinter;

public class Starter {

    public static void start() {

        //Activities 30/11/20
        MessagePrinter.printSwapCharacters("yvan eht nioj");
        MessagePrinter.printSumNumbers(15);
        MessagePrinter.printFibonacci(46);

        //Activities 1/12/20
//        MessagePrinter.printPalindromeChecker("racecar");
//        MessagePrinter.printLongestPalindrome("madam nathan racecar sparta hashtag 1234554321");

        //Activities 7/12/20
        int[] arrayToSort = {1,2,3,1,2,3,1,2,3};
        MessagePrinter.printBubbleSort(arrayToSort);
    }

}
