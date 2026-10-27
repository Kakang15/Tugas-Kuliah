package assignment5;

public class StudentScores {
    public static void main(String[] args) {
        int[] scores = {80, 75, 90, 65, 85};

        System.out.println("Student Scores:");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("Score at index 2: " + scores[2]);
    }
}
