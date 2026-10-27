
package assignment5;

public class StudentRanking {
    public static void main(String[] args){
        int[] scores = {78,90,65,90,85,72,95,85};

        for (int i = 0; i < scores.length - 1; i++){
            for (int j = 0; j < scores.length - 1 - i; j++){
                if (scores[j] < scores[j + 1]){
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Scores: ");
        for (int s : scores) System.out.print(s + " ");
        
        System.out.println("\n\nTop Three Distinct Scores:");
        int count = 0, previous = -1;

        for (int s : scores){
            if (s != previous) {
                System.out.println(s);
                previous = s;
                if (++count == 3) break;
            }
        }

        System.out.println("\nStudent Rankings:");
        int[] original = {78,90,65,90,85,72,95,85};

        for (int s : original){
            int rank = 1;
            for (int other : original)
                if (other > s) rank++;

            System.out.println("Score " + s + " = Rank " + rank);
        }
    }

}

