import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        boolean exit = false;

        System.out.println("Welcome to Simple Bank!");

        while (!exit) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Check Balance
                    System.out.printf("Your current balance is: %.2f%n", balance);
                    break;

                case 2: // Deposit
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("You have successfully deposited %.2f%n", deposit);
                    } else {
                        System.out.println("Deposit amount must be greater than zero.");
                    }
                    break;

                case 3: // Withdraw
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else if (withdraw > 0) {
                        balance -= withdraw;
                        System.out.printf("You have successfully withdrawn %.2f%n", withdraw);
                    } else {
                        System.out.println("Withdrawal amount must be greater than zero.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using Simple Bank. Goodbye!");
                    exit = true;
                    break;

                default: // Invalid Option
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
