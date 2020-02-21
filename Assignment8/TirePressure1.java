import java.util.Scanner;

public class TirePressure1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int frontLeft, frontRight, backLeft, backRight;
        
        System.out.println("Input front right pressure");
        frontRight = scan.nextInt();
        System.out.println("Input front left pressure");
        frontLeft = scan.nextInt();
        System.out.println("Input back right pressure");
        backRight = scan.nextInt();
        System.out.println("Input back left pressure");
        backLeft = scan.nextInt();
        
        if (frontRight == frontLeft && backRight == backLeft) {
            System.out.println("Inflation is OK");
        }
        else {
            System.out.println("Inflation is BAD");
        }
    }
}