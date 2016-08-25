import java.util.Scanner;

/**
 * 
 * @author ËÎÓëçñ
 * @version 1.0
 */
public class TestAccount {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Account acct1;
        Account acct2;
        Account acct3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to **bank");
        System.out.println();
        
            String Name;
            System.out.println("------------------Account 1---------------------");
            System.out.print("Please enter first account user name: ");
            Name = scan.next();
            acct1 = new Account(100, Name);
            System.out.println("\nCreated account " + acct1);
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
            System.out.println("------------------Account 2-----------------------");
            
            System.out.print("Please enter second account user name: ");
            Name = scan.next();
            acct2 = new Account(100, Name);
            System.out.println("\nCreated account " + acct2);
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
            System.out.println("------------------Account 3-----------------------");
            
            System.out.print("Please enter third account user name: ");
            Name = scan.next();
            acct3 = new Account(100, Name);
            System.out.println("\nCreated account " + acct3);
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
            System.out.println("------------------Close Account1-------------------");
            
            acct1.close();
            System.out.println(acct1);
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
            System.out.println("------------------Consolidate 2&3------------------");
            
            System.out.println(Account.accountConsolidate(acct2,acct3));
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
            
            
            scan.close();
            
        }
        
    
    }


