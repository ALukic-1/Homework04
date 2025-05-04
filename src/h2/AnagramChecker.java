package h2;

import java.sql.Array;

public class AnagramChecker {

    /**
     * Returns true if the two strings are anagrams of each other .
     */
    public static boolean isAnagram(String a, String b) {
        // TODO : implement using countLetters ()
        int[] arrA = countLetters(a);
        int[] arrB = countLetters(b);

        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                return false;
            }
        }
        return true;


    }


    /**
     * Helper method to count how many times each letter (a-z) appears .
     */
    public static int[] countLetters(String s) {
        int[] counts = new int[26];
        // TODO : fill array with letter frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = (c - 'a');
                counts[index] = counts[index] + 1;
            }
        }
        return counts;
    }


    /**
     * Print only letters that appear in the string with their counts .
     */
    public static void printLetterCounts(String s) {
// TODO : implement nicely formatted output

        int[] numbers = countLetters(s);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                char letter = (char) ('a' + i);
                System.out.println( letter + ": "+ numbers[i]);
            }
        }

    }

}
