package Session6;
import java.util.Scanner;

public class AtmSimulation {
    public static void main(String[] args) {
        Scanner inputY = new Scanner(System.in);
        int balance = 1000000;
        int[] transactions = new int[5];
        int historyIndex = 0;
        int totalDeposit = 0;
        int totalWithdrawn = 0;
        System.out.print("Navigation \n1)Deposit \n2)Withdrawal \n3)Check Balance \n4)Amount Deposited \n5)Amount withdrawn \n6)Transactions \n0)Exit\n");
        do {
            System.out.print("\nSelect Menu: ");
            int menu = inputY.nextInt();
            if ((menu == 1 || menu == 2) && historyIndex == 5) {
                System.out.print("Transaction full");
                continue;
            }
            if (menu == 0) {
                break;
            }else if (menu == 1) {
                System.out.print("Input amount: ");
                int amount = inputY.nextInt();
                balance += amount;
                totalDeposit += amount;
                transactions[historyIndex++] = amount;
            }else if (menu == 2) {
                System.out.print("Input amount: ");
                int amount = inputY.nextInt();
                if (balance < amount) {
                    System.out.print("insufficient amount, your balance is "+balance);
                    continue;
                }
                balance -= amount;
                totalWithdrawn += amount;
                transactions[historyIndex++] = -amount;
            }else if (menu == 3) {
                System.out.print("Balance: "+balance);
            }else if (menu == 4){
                System.out.print("Amount Deposit: "+ totalDeposit);
            }else if (menu == 5){
                System.out.print("Amount Deposit: "+ totalWithdrawn);
            }else if (menu == 6) {
                for (int i=0; i<transactions.length; i++) {
                    System.out.println(i+1+" "+transactions[i]);
                }
            }
        }while(true);
    }   
}