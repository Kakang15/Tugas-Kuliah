package sessiontest;
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = input.nextInt();

        System.out.print("Enter side 2: ");
        int b = input.nextInt();

        System.out.print("Enter side 3: ");
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}