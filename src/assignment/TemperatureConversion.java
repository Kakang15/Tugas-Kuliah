package assignment;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char again;

        do{
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double reaumur = celsius * 4 / 5;

        System.out.println("Temperature in Reaumur: " + reaumur);
        
        System.out.print("Do you want to calculate again? (y/n): ");
        again = input.next().charAt(0);
        }while (again == 'y' || again == 'Y');
        input.close();
    }
}
