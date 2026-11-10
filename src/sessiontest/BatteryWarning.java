package sessiontest;
import java.util.Scanner;
public class BatteryWarning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Battery:");

        int battery = input.nextInt();

        if(battery <= 20){
            System.out.print("Low Battery");
        }else{
            System.out.print("Battery OK");
        }
        input.close();
    }
}
