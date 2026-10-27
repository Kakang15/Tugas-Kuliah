package assignment5;

public class DailySales {
    public static void main(String[] args) {
        int[] sales = {100000, 150000, 125000, 200000, 175000};

        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        System.out.println("Total Sales: Rp" + total);
        System.out.println("Number of Days: " + sales.length);
    }
}
