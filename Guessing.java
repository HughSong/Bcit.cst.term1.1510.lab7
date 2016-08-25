import java.util.Random;
import java.util.Scanner;

/**
 * Demonstrates the use of a block statement in an if-else.
 *
 * @author Hugh
 * @version 1
 */
public class Guessing {
    /** Number in guessing range. */
    private static final int MAX = 10;

    /**
    * Plays a simple guessing game with the user.
    * @param args Unused
    */
    public static void main(String[] args) {
        int answer;
        int guess;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        answer = generator.nextInt(MAX) + 1;
        System.out.println(answer);
       /* boolean firstGuess = true;
        do
        {
            if(firstGuess == true)
            { System.out.print("I am thinking about a number between 1 and " + MAX
                + ". Guess what it is: ");
                firstGuess = false;
            }
            else 
            {
                System.out.print("FALSE!Please try again. Guess what it is: ");
            }
          guess = scan.nextInt();

        }
        while(guess!=answer);
        System.out.println("Correct! The number is: " + answer);*/
        scan.close();
    }
}