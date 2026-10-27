package Session5;

public class ArrayMulti {
    public static void main(String[] args) {
        String groups[][] = {
            {"Group 1", "John", "Jane"},
            {"Group 2", "Agus", "Asep"},
            {"Group 3", "Algies", "Alfian"}
        };
        
        for(int i = 0;  i < groups.length; i++){
            for (int j = 0; j < groups[i].length; j++){
                System.out.print(groups[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
