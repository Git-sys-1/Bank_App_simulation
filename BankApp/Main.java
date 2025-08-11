import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create account
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        Account myAccount = new Account(name, accNumber, initialBalance);

        // Menu loop
        int choice;
        do {
            System.out.println("\nBank Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    myAccount.showBalance();
                    break;
                case 4:
                    myAccount.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
