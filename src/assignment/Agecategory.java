package assignment;

public class Agecategory {
    public static void main(String[] args) {
        int age = 3;

        if(age >= 0 && age <= 5) {
            System.out.print("Toddler");
        }else if(age >= 6 && age <= 12) {
            System.out.print("Child");
        }else if(age >= 13 && age <= 17) {
            System.out.print("Teenager");
        }else if(age >= 18 && age <= 59) {
            System.out.print("Adult");
        }else if(age >= 60) {
            System.out.print("Senior");
        }else {
            System.out.print("Invalid age");
        }

    }

}
