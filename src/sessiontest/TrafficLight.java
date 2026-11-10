package sessiontest;
import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter light color: ");
        String color = input.nextLine().toLowerCase();

        System.out.print("Pedestrian crossing? (yes/no): ");
        String pedestrian = input.nextLine().toLowerCase();

        if (color.equals("green") && pedestrian.equals("no")) {
            System.out.println("Go");
        } else if (color.equals("green") && pedestrian.equals("yes")) {
            System.out.println("Wait");
        } else if (color.equals("yellow")) {
            System.out.println("Slow Down");
        } else if (color.equals("red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Invalid Colour");
        }
    }
}