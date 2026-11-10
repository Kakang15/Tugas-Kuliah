package sessiontest;
import java.util.Scanner;
public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter N:");
        int N = input.nextInt();

        int power = 1;

        for (int i = 0; i <= N; i++){
            System.out.print(power + " ");
            power = power * 2;
        }
        input.close();
    }
}
