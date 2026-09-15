import java.util.Scanner;

public class Assignment10Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        while (true) {
            System.out.println("\n1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Withdrawal amount must be positive.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Amount withdrawn successfully.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid menu choice.");
            }
        }
    }
}
