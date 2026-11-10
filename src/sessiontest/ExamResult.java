package sessiontest;
import java.util.Scanner;
public class ExamResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Score:");
     int scores = input.nextInt();
     
     if(scores >= 70){
        System.out.print("Passed");
     }else{
        System.out.print("Failed");
     }
     input.close();
    }
}
