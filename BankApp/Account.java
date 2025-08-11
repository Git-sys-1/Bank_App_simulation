import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;

    // Constructor
    public Account(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: $" + initialBalance);
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount);
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
            System.out.println("Withdrew $" + amount + " successfully.");
        }
    }

    // Show Balance
    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Show Transaction History
    public void showTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Getter for account number (for possible future extensions)
    public String getAccountNumber() {
        return accountNumber;
    }
}
