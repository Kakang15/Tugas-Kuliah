package assignment;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentYear = 2026;

        char again;

        do {
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Your age is: " + age);

        System.out.print("calculate again? (yes/no): ");
        again = input.next().charAt(0);

        } while (again == 'y' || again == 'Y');
        input.close();
    }
}
