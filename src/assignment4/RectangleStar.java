
package assignment4;

public class RectangleStar {
    public static void main(String[] args) {
        int R = 3;
        int C = 5;

        for (int i = 1; i <= R; i++) {
            for (int x = 1; x <= C; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
