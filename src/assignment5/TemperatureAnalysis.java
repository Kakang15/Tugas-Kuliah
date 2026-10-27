package assignment5;

public class TemperatureAnalysis {
    public static void main(String[] args) {
        int[] temperatures = {29, 32, 27, 35, 31, 26, 34};

        int max = temperatures[0];
        int min = temperatures[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
                maxIndex = i;
            }

            if (temperatures[i] < min) {
                min = temperatures[i];
                minIndex = i;
            }
        }

        System.out.println("Highest: " + max);
        System.out.println("Highest Index: " + maxIndex);
        System.out.println("Lowest: " + min);
        System.out.println("Lowest Index: " + minIndex);
        System.out.println("Difference: " + (max - min));
    }
}

