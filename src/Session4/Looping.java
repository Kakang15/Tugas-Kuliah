package Session4;

public class Looping {
    public static void main(String[] args) {
        String amba = "to camp";
        for (int i=1; i<=10; i+=1) {

            if (i%3 == 0) amba = "sing";
            else if (i%2 == 0) amba = "tron";
            else amba = "to camp";

            System.out.println(i+") I'm back "+amba);
            }
        }
    }