package Session4;

public class NumberPattern {
    public static void main(String[] args) {
        
        for (int i=1; i<=19; i+=2) {
        System.out.print(i+" ");
        }
        
        System.out.println();
         for (int x=30; x>=0; x-=2) {
        System.out.print(x+" ");
        }
        
        System.out.println();
        for (int a=-3; a<=12; a+=3) {
        System.out.print(a+" ");
        }
        
        System.out.println();
        for (int b=23; b>=-2; b-=5) {
        if (b == -2) System.out.print("0");
        else System.out.print(b+" ");
        }
        
        System.out.println();
        int d = 3;
        for (int c=1; c<=22; c+=d) {
        System.out.print(c+" ");
        d++;
        }
    }
}
