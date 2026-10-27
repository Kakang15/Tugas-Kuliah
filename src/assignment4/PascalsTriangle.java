
package assignment4;

public class PascalsTriangle {
    public static void main(String[] args) {
       int rows = 5;

       for (int i = 0; i < rows; i++){
        int number = 1;

        for (int x = 0; x <= i; x++){
            System.out.print(number + " ");
            number = number * (i - x) / (x + 1);
        }
        System.out.println();
       }
    }
}
