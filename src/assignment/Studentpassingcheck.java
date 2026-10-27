package assignment;

public class Studentpassingcheck {
    public static void main(String[] args) {
        int score = 70;
        int attendance = 75;

        if(score >= 60 && attendance >= 75){
            System.out.print("Passed");
        }else{
            System.out.print("Failed");
        }
    }

}
