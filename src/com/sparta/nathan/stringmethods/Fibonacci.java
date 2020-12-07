package com.sparta.nathan.stringmethods;

import java.util.Arrays;

public class Fibonacci {

    /**
     *  Create Fibonacci Sequence in fixed-length array using
     *  for loop. First two values need to be hard-coded.
     */
    public static void  fibonacci(int resolution) {
        int[] fibonacciSequence =  new int[resolution];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for(int i = 2; i < fibonacciSequence.length; i++) {
            fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];
        }

        System.out.println("Fibonacci Sequence = " + Arrays.toString(fibonacciSequence));
    }

}
