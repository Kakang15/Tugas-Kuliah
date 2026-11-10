package sessiontest;
import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {
            int remainder = x % y;
            x = y;
            y = remainder;
        }

        int gcd = x;
        int lcm = (a / gcd) * b;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        input.close();
    }
}