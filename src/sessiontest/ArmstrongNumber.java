package sessiontest;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;
            int digits = 0;

            int count = i;

            while (count > 0) {
                digits++;
                count = count / 10;
            }

            temp = i;

            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;

                for (int j = 1; j <= digits; j++) {
                    power = power * digit;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}