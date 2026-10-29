
package assignment6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtmQueue {
    public static void main(String[] args) {
        Scanner inputY = new Scanner(System.in);

        int balance = 1000000;
        Queue<Integer> transactions = new LinkedList<>();

        System.out.print("Navigation \n1)Deposit \n2)Withdrawal"
                + " \n3)Check Balance \n4)Amount Deposited"
                + " \n5)Amount withdrawn \n6)Transactions \n0)Exit\n");

        do {
            System.out.print("\nSelect Menu: ");
            int menu = inputY.nextInt();

            if (menu == 0) {
                break;
            } else if (menu == 1 || menu == 2) {
                if (transactions.size() == 5) {
                    System.out.println("Transaction full");
                    continue;
                }

                System.out.print("Input amount: ");
                int amount = inputY.nextInt();

                if (amount <= 0) {
                    System.out.println("Invalid amount");
                    continue;
                }

                if (menu == 1) {
                    balance += amount;
                    transactions.offer(amount);
                } else {
                    if (balance < amount) {
                        System.out.println(
                                "Insufficient amount, your balance is " + balance);
                        continue;
                    }

                    balance -= amount;
                    transactions.offer(-amount);
                }
            } else if (menu == 3) {
                System.out.println("Balance: " + balance);
            } else if (menu == 4) {
                int totalDeposit = 0;

                for (int transaction : transactions) {
                    if (transaction > 0) {
                        totalDeposit += transaction;
                    }
                }

                System.out.println("Total Deposit: " + totalDeposit);
            } else if (menu == 5) {
                int totalWithdrawn = 0;

                for (int transaction : transactions) {
                    if (transaction < 0) {
                        totalWithdrawn += Math.abs(transaction);
                    }
                }

                System.out.println("Total Withdrawn: " + totalWithdrawn);
            } else if (menu == 6) {
                System.out.println("Transaction History:");

                int i = 1;
                for (int transaction : transactions) {
                    System.out.println(i++ + " " + transaction);
                }
            } else {
                System.out.println("Invalid menu");
            }
        } while (true);

        inputY.close();
        System.out.println("Thank you for using ATM!");
    }
}
