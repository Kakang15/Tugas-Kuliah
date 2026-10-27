
package assignment5;

public class ArrayMulti {
    public static void main(String[] args) {
        int[][] scores = {
            {80, 75, 90},
            {65, 70, 85},
            {90, 95, 88},
            {72, 68, 78}
        };
        String[] students = {"Student 1", "Student 2", "Student 3", "Student 4",};
        String[] courses = {"Course 1", "Course 2", "Course 3"};

        System.out.println("Student Score:");

        for (int i = 0; i < scores.length; i++){
            int total = 0;
            System.out.print(students[i] + ": ");

            for (int j = 0; j < scores[i].length; j++){
                System.out.print(courses[j] + "=" + scores[i][j] + " ");
                total += scores[i][j];
            }
            System.out.printf("Average = %.2f%n", (double) total / scores[i].length);
        }
        System.out.println("\nCourse Avarage:");

        for (int j = 0; j < scores[0].length; j++){
            int total = 0;

            for (int[] student : scores) total += student[j];

            System.out.printf("%s: %.2f%n", courses[j], (double) total / scores.length);
        }
    }
}