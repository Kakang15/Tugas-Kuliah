package sessiontest;
import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = input.nextInt();

        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        int max = 0;

        if (month == 1 || month == 3 || month == 5 ||
            month == 7 || month == 8 || month == 10 ||
            month == 12) {
            max = 31;
        } else if (month == 4 || month == 6 ||
                   month == 9 || month == 11) {
            max = 30;
        } else if (month == 2) {
            if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)) {
                max = 29;
            } else {
                max = 28;
            }
        }

        if (year > 0 && month >= 1 && month <= 12 &&
            day >= 1 && day <= max) {
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid Date");
        }
    }
}