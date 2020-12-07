package com.sparta.nathan.stringmethods;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        int placeholder;
        System.out.println("Array before Bubble Sort:: " + Arrays.toString(arrayToSort));

        for(int i = 0; i < arrayLength; i++) {
            for(int j = 1; j < (arrayLength - 1); j++) {
                if(arrayToSort[j-1] > arrayToSort[j]) {
                    placeholder = arrayToSort[j-1];
                    arrayToSort[j-1] = arrayToSort[j];
                    arrayToSort[j] = placeholder;
                }
            }
        }
        System.out.println("Array after Bubble Sort:: " + Arrays.toString(arrayToSort));
    }

}
