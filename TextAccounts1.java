
//************************************************************
// TestAccounts1
// A simple program to test the numAccts method of the
// Account class.
//************************************************************
import java.util.Scanner;

public class TextAccounts1 {
    public static void main(String[] args) {
        Account testAcct;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            String Name;
            System.out.print("Please enter account"+i+"'s user name: ");
            Name = scan.next();
            testAcct = new Account(100, Name);
            System.out.println("\nCreated account " + testAcct);
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
        }
        
    }
}