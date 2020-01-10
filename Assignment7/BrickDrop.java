import java.util.Scanner;

public class BrickDrop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double d, g, t;
        
        g = 32.174;
        
        System.out.print("Enter the number of seconds: ");
        t = scan.nextDouble();
        
        d = (1f/2f)*g*t*t;
        
        System.out.print("Distance: ");
        System.out.print(String.format("%.03f", d));
        System.out.println(" feet");
    }
}