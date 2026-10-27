package assignment;
import java.util.Scanner;

public class MotorcycleParkingFixed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char again;

        do{
        System.out.print("Enter parking hours: ");
        int hours = input.nextInt();

        int totalFee = hours * 3000;

        System.out.println("Total parking fee: Rp" + totalFee);

        System.out.print("Do you want to calculate again? (y/n): ");
        again = input.next().charAt(0);
        }while (again == 'y' || again == 'Y');
        input.close();
    }
}
