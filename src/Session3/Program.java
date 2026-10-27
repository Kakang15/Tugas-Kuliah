package Session3;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");

         int number = scanner.nextInt();

         if (number > 0) {
            System.out.print("Positive");
         } else if (number < 0){
            System.out.print("Negative");
         } else {
            System.out.print("The number is zero (0)");
         }
        scanner.close();
    }

}