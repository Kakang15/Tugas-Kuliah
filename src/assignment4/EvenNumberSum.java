
package assignment4;

public class EvenNumberSum {
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}
