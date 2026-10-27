package assignment;
import java.util.Scanner;

public class MotorcycleParkingDifferent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char again;

        do{
        System.out.print("Enter parking hours: ");
        int hours = input.nextInt();

        int totalFee;

        if (hours <= 1) {
            totalFee = 3000;
        } else {
            totalFee = 3000 + (hours - 1) * 2000;
        }
        
        System.out.println("Total parking fee: Rp" + totalFee);

        System.out.print("Do you want to calculate again? (y/n): ");
        again = input.next().charAt(0);
        } while (again == 'y' || again == 'Y');
        input.close();
    }
}
