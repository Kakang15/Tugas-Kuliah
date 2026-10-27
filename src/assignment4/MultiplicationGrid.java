
package assignment4;

public class MultiplicationGrid {
    public static void main(String[] args) {
        int N = 4;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print((i * j) + " ");
            }

            System.out.println();
        }
    }
}
