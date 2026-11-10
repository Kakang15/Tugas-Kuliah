package sessiontest;
import java.util.Scanner;
public class TimeOfDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Hour:");
        int hour = input.nextInt();

        if(hour >= 5 && hour <= 11){
            System.out.print("Good Morning");
        }else if(hour >= 12 && hour <= 17){
            System.out.print("Good Afternoon");
        }else if(hour >= 18 && hour <= 21){
            System.out.print("Good Evening");
        }else{
            System.out.print("Good Night");
        }
    input.close();
}
}
