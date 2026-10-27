package assignment;
import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char again;

        do{
        System.out.print("Enter total purchase amount: Rp");
        int purchase = input.nextInt();

        System.out.print("Enter amount paid: Rp");
        int payment = input.nextInt();

        if (payment >= purchase) {
            int change = payment - purchase;
            System.out.println("Change: Rp" + change);
        } else {
            int shortage = purchase - payment;
            System.out.println("Money needed: Rp" + shortage);

        } 
            System.out.print("calculate again? (yes/no): ");
            again = input.next().charAt(0);

        
            } while (again == 'y' || again == 'Y');
            input.close();
    }
}
