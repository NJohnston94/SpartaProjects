package com.sparta.nathan.messages;

import com.sparta.nathan.stringmethods.*;

public class MessagePrinter {

    public static void printSwapCharacters(String string) {

        System.out.println("-----Start Swap Characters-----");
        SwapCharacters.swapCharacters(string);
        System.out.println("------End Swap Characters------");
        System.out.println(" ");

    }

    public static void printSumNumbers(int resolution) {

        System.out.println("-----Start Sum Numbers-----");
        SumNumbers.sumNumbers(resolution);
        System.out.println("------End Sum Numbers------");
        System.out.println(" ");

    }

    public static void printFibonacci(int resolution) {

        System.out.println("-----Start Fibonacci Sequence-----");
        Fibonacci.fibonacci(resolution);
        System.out.println("------End Fibonacci------");
        System.out.println(" ");

    }

    public static void printPalindromeChecker(String toCheck) {

        System.out.println("-----Start Palindrome Checker-----");
        System.out.println("Is palindrome?:: " + Palindrome.palindromeChecker(toCheck));
        System.out.println("------End Palindrome Checker------");
        System.out.println(" ");

    }

    public static void printLongestPalindrome(String sentenceToCheck) {

        System.out.println("-----Start Longest Palindrome-----");
        System.out.println("Longest palindrome?:: " + Palindrome.longestPalindromeChecker(sentenceToCheck));
        System.out.println("------End Longest Palindrome------");
        System.out.println(" ");

    }

    public static void printBubbleSort(int[] arrayToSort) {

        System.out.println("-----Start Bubble Sort-----");
        BubbleSort.bubbleSort(arrayToSort);
        System.out.println("------End Bubble Sort------");
        System.out.println(" ");

    }

}
