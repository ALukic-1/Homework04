package h2;

import java.util.Locale;
import java.util.Scanner;

import static h2.AnagramChecker.isAnagram;
import static h2.AnagramChecker.printLetterCounts;

public class Main {


    public static void main ( String [] args ) {
    Scanner scanner = new Scanner(System.in);
// Get two strings from the user
    System.out.print(" Enter the first string : ");
    String word1 = scanner.nextLine();
    System.out.print(" Enter the second string : ");
    String word2 = scanner.nextLine();
// TODO : Process the strings here ( ignore spaces , case )

        word1 = word1.toLowerCase(Locale.GERMAN);
        word1 = word1.trim();

        word2 = word2.toLowerCase(Locale.GERMAN);
        word2 = word2.trim();

    System.out.println(" Are they anagrams ? "+ isAnagram (word1 , word2 ));

   printLetterCounts(word1);

}


}
