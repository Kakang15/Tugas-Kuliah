package sessiontest;
import java.util.Scanner;
public class SavingsInterestTable {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter initial deposit: ");
    double balance = input.nextDouble();

    System.out.print("Enter number of years: ");
    int years = input.nextInt();

    for (int i = 1; i <= years; i++){
        balance = balance * 1.10;

        System.out.printf("%.0f ", balance);
    }
    input.close();
 }
}
