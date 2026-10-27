package assignment5;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] ids = {101, 102, 101, 103, 102, 104, 105, 103};
        int[] unique = new int[ids.length];
        int count = 0;

        System.out.println("Duplicated IDs:");

        for (int i = 0; i < ids.length; i++) {
            boolean appearedBefore = false;

            for (int j = 0; j < i; j++) {
                if (ids[i] == ids[j]) {
                    appearedBefore = true;
                    break;
                }
            }

            if (!appearedBefore) {
                boolean appearsAgain = false;

                for (int j = i + 1; j < ids.length; j++) {
                    if (ids[i] == ids[j]) {
                        appearsAgain = true;
                        break;
                    }
                }

                if (appearsAgain) {
                    System.out.println(ids[i]);
                }

                unique[count] = ids[i];
                count++;
            }
        }

        System.out.print("Unique IDs: ");

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

        System.out.println("\nUnique Participants: " + count);
    }
}
