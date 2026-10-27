package Session4;

public class LoopInsideLoop {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++){
            for (int x=1; x<=5+i; x++){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
