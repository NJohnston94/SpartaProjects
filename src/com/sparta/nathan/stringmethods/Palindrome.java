package com.sparta.nathan.stringmethods;

import org.jetbrains.annotations.NotNull;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    /*
        Palindrome Activities - 01/12/20

        Re-implement these methods using String.split() and see how much more
        efficient it is
     */
//---------------------------------------------------------------------------------
    /**
     *  A Palindrome is a sequence that reads the same forwards and backwards.
     *  This method checks if the argument is a palindrome and returns true if
     *  it is or false if it isn't.
     * @param toCheck   String to be checked
     * @return          true if the argument String is a palindrome
     */
    public static boolean palindromeChecker(@NotNull String toCheck) {
        char[] stringOriginal = toCheck.toLowerCase().toCharArray();
        char[] stringToCheck = toCheck.toLowerCase().toCharArray();
        int j = (stringToCheck.length - 1);
        System.out.println("stringToCheck:: " + Arrays.toString(stringOriginal));
        
        for(int i = 0; i <= ((stringToCheck.length-1)/2); i++) {
             j -= i;
            char placeHolder = stringToCheck[i];

            stringToCheck[i] = stringToCheck[j];
            stringToCheck[j] = placeHolder;
            System.out.println("String after iteration " + i + ":: " + Arrays.toString(stringToCheck));
        }

        return Arrays.equals(stringOriginal, stringToCheck);
    }
//-----------------------------------------------------------------------------------------
    /**
     * Extract words from an argument sentence, use the above method to check if each
     * is a palindrome or not, then finally return the longest palindrome. If there are
     * no palindromes, return an error message.
     * @param sentenceToSplit String to be checked for palindromes
     * @return                Longest palindrome or error if there are none
     */
    public static String longestPalindromeChecker(@NotNull String sentenceToSplit) {

        int spaceIndexCurrent = 0;
        int spaceIndexNext    = sentenceToSplit.indexOf(" ");
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Next index:: " + spaceIndexNext);

        //populate ArrayList with words from argument
        extractWords(sentenceToSplit,spaceIndexCurrent,spaceIndexNext,words);

        //remove non-palindromes from ArrayList and return longest palindrome
        String longestPalindrome = returnLongestPalindrome(words);

        //check that returned value is a palindrome
        if(longestPalindrome.equals("")) {
            System.err.println("No palindromes in argument");
        }

        return longestPalindrome;
    }
//-----------------------------------------------------------------------------------------------
    /**
     * Find the next space in the argument String and use the indexes to extract
     * the word between the spaces and add it to an ArrayList. The last word has no
     * space and therefore uses substring() with a single index.
     * @param sentenceToSplit   Same as original argument for longestPalindromeChecker
     * @param spaceIndexCurrent Always starts at 0, replaced by spaceIndexNext on iteration
     * @param spaceIndexNext    Always starts at index of first space and eventually equals -1 to break the loop
     * @param words             ArrayList to store extracted words
     */
    public static void extractWords(String sentenceToSplit,
                                    int spaceIndexCurrent,
                                    int spaceIndexNext,
                                    ArrayList<String> words) {
        if(spaceIndexNext > -1){
            do {
                String word = sentenceToSplit.substring(spaceIndexCurrent, spaceIndexNext);
                word = word.strip();
                words.add(word);
                System.out.println("Word added:: " + word);
                spaceIndexCurrent = spaceIndexNext;
                spaceIndexNext = sentenceToSplit.indexOf(" ", spaceIndexCurrent + 1);
                System.out.println("Next index:: " + spaceIndexNext);
            } while(spaceIndexNext > -1);
            //add the last word in the sentence to the ArrayList
            String word = sentenceToSplit.substring(spaceIndexCurrent);
            word = word.strip();
            words.add(word);
            System.out.println("Word added:: " + word);
        }
    }
//----------------------------------------------------------------------------------------------
    /**
     * Iterate through extracted words and remove those which are not palindromes.
     * If there are no palindromes, a blank string is initialised instead of returning null.
     * A 'dummy' ArrayList is used to store the non-palindromes to be removed from the
     * argument ArrayList after it has been iterated through to avoid the
     * ConcurrentModificationException.
     * @param words ArrayList of words extracted from original sentence
     * @return      return longest palindrome or ""
     */
    public static String returnLongestPalindrome(ArrayList<String> words) {
        String longestPalindrome = "";
        ArrayList<String> wordsToRemove = new ArrayList<>();

        for(String word:words) {
            if(!palindromeChecker(word)) {
                wordsToRemove.add(word);
                System.out.println("Word removed:: " + word);
            }
        }

        words.removeAll(wordsToRemove);

        for(String word:words) {
            if(word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
            }
        }

        return longestPalindrome;
    }
}
