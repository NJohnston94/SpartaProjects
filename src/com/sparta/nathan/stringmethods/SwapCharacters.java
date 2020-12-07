package com.sparta.nathan.stringmethods;

import java.util.Arrays;

public class SwapCharacters {

    /**
     * Swap values of a hard-coded array of integers
     * using switch statement in for loop
     * @param string argument converted to char[]
     */
    public static void swapCharacters(String string) {
        char[] charsToSwap = string.toCharArray();
        System.out.println("Characters to Swap: " + Arrays.toString(charsToSwap));

        for(int i = 0; i < (charsToSwap.length/2); i++) {
            //j is the 'opposite' number of i
            int j = (charsToSwap.length - 1) - i;
            //placeHolder stores char at i until assignment
            char placeHolder = charsToSwap[i];

            //swap characters in array using i and j
            charsToSwap[i] = charsToSwap[j];
            charsToSwap[j] = placeHolder;
            System.out.println("String after iteration " + i + ":: " + Arrays.toString(charsToSwap));

        }
        System.out.println("Swapped Characters:: " + Arrays.toString(charsToSwap));
    }

}
