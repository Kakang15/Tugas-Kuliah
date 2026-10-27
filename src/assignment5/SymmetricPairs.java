package assignment5;
public class SymmetricPairs {
    public static void main(String[] args){
        int[] data = {1,2,3,4,5};
        int[] original = data.clone();

        for (int i = 0; i < data.length; i++){
            data[i] = original[i]
            + original[data.length - 1 - i];
        }

        System.out.println(
            java.util.Arrays.toString(data)
        );
    }
}
