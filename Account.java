import java.util.Random;

//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
/**
 * @author ËÎÓëçñ
 * @version 1.0
 */
public class Account {
    private double balance;
    private String name;
    private long acctNum;
    private Random generator;
    private static int numAccounts = 0;
    // -------------------------------------------------
    // Constructor -- initializes balance, owner, and account number
    // -------------------------------------------------
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    }
    public Account(double initBal, String owner) {
        generator = new Random();
        balance = initBal;
        name = owner;
        acctNum = Math.abs(generator.nextLong());
        numAccounts++;
    }
    public Account(String owner) {
        generator = new Random();
        balance = 0;
        name = owner;
        acctNum = Math.abs(generator.nextLong());
        numAccounts++;
    }

    // -------------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    // -------------------------------------------------
    public void withdraw(double amount) {
        if (balance >=  amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    // -------------------------------------------------
    // Adds deposit amount to balance.
    // -------------------------------------------------
    public void deposit(double amount) {
        balance += amount;
    }

    // -------------------------------------------------
    // Returns balance.
    // -------------------------------------------------
    public double getBalance() {
        return balance;
    }
    public static int getNumAccounts() {
        return numAccounts;
    }
    public void close() {
        balance = 0;
        name = "CLOSED";
        numAccounts--;
    }
    public static Account accountConsolidate(Account acct2, Account acct3) {
       
        if(acct2.name.equals(acct3.name) && acct2.acctNum!=(acct3.acctNum))
        {
            Account tacct = new Account(acct2.name);
            tacct.balance = acct2.balance +acct2.balance;
            acct2.close();
            acct3.close();
            return tacct;
        }
        else
        {   
            System.out.println("Sorry, please make sure these two accounts have the same user name and different account number!");
            return null;
        }
        
        
    }
    // -------------------------------------------------
    // Returns a string containing the name, account number, and balance.
    // -------------------------------------------------
    public String toString() {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    }
}