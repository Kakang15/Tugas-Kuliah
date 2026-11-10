package sessiontest;
import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int speed = input.nextInt();

        if (speed > 80) {
            System.out.println("Speeding - Slow Down");
        } else {
            System.out.println("Safe Speed");
        }
    }
}