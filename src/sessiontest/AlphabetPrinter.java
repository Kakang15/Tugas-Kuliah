package sessiontest;
import java.util.Scanner;
public class AlphabetPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Number:");
        int N = input.nextInt();

         for (int i = 0; i <= N; i++){
            char letter = (char) ('A' + i);
         System.out.print(letter + " ");
         }
    }
}
