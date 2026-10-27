package assignment;
import java.util.Scanner;
public class Parkingfee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee;

        System.out.print("Enter parking hours: ");
            int hours = scanner.nextInt();

        if (hours <= 1) {
            fee = 5000;
        } else {
            fee = 5000 + (hours - 1) * 3000;
        }

        if(fee > 20000) {
            fee = 20000;
        }

        System.out.println("Total parking fee: Rp" + fee);
    scanner.close();
    }
}
