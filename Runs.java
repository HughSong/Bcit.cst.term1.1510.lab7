// ******************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// *******************************************************************
/**
 * @author ËÎÓëçñ
 * @version 1.0
 */
public class Runs {
    public static void main(String[] args) {
        final int FLIPS = 100; // number of coin flips
        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0; // length of the maximum run so far
        // Create a coin object
        Coin myCoin = new Coin();
        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++) {
            // Flip the coin & print the result
            myCoin.flip();
            System.out.println(myCoin);
            if(myCoin.isHeads() == true)
            {
                currentRun++;
                if(currentRun>maxRun)
                {
                    maxRun = currentRun;
                }
            }
            else
            {
                currentRun = 0;
            }
            // Update the run information
        }
        // Print the results
        System.out.println("The maximum times that head continuously appears is: " + maxRun);
    }
}