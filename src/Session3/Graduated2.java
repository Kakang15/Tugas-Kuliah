package Session3;

public class Graduated2 {
    public static void main(String[] args) {
        char index = 'E';
        Double score = 75.0;

        if (score >= 90)
            index = 'A';
        else if (score >= 80)
            index = 'B';
        else if (score >= 70)
            index = 'C';
        else
            index = 'D';

        System.out.print("The index from score "+score+" is "+index);
}
}