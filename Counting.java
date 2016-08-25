
// ************************************************************
// Count.java
//
// This program reads in strings (phrases) and counts the
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************
import java.util.Scanner;

/**
 * 
 * @author ËÎÓëçñ
 * @version 1.0
 */
public class Counting {
    public static void main(String[] args) {
        String phrase; // a string of characters
        int countBlank; // the number of blanks (spaces) in the phrase
        int length; // the length of the phrase
        char ch; // an individual character in the string
        int countA = 0;
        int countE = 0;
        int countS = 0;
        int countT = 0;
        Scanner scan = new Scanner(System.in);
        // Print a program header
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();
        do {
            // Read in a string and find its length
            System.out.print("Enter a sentence or phrase: ");
            phrase = scan.nextLine();
            length = phrase.length();
            // Initialize counts
            countBlank = 0;
            // a for loop to go through the string character by character

            for (int i = 0; i < length; i++) {
                ch = phrase.charAt(i);
                if (ch == ' ') {
                    countBlank++;
                }
                switch (ch) {
                case 'a':
                    countA++;
                    break;
                case 'A':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'E':
                    countE++;
                    break;
                case 's':
                    countS++;
                    break;
                case 'S':
                    countS++;
                    break;
                case 't':
                    countT++;
                    break;
                case 'T':
                    countT++;
                    break;
                }
            }

            // and count the blank spaces
            // Print the results
            if (phrase.equals("quit") == false) {
                System.out.println("Number of blank spaces: " + countBlank);
                System.out.println("Number of character a: " + countA);
                System.out.println("Number of character e: " + countE);
                System.out.println("Number of character s: " + countS);
                System.out.println("Number of character t: " + countT);
            }
        } while (phrase.equals("quit") == false);
        System.out.println("Test is closed!");

    }
}