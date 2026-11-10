package sessiontest;
import java.util.Scanner;

public class CollatzSteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int steps = 0;

        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

            steps++;
        }

        System.out.println("1");
        System.out.println("Total steps = " + steps);
    }
}