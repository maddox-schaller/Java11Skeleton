import java.util.Scanner;

public class TirePressure2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int frontLeft, frontRight, backLeft, backRight;
        
        System.out.println("Input front right pressure");
        frontRight = scan.nextInt();
        if (34 < frontRight && frontRight < 46) {
            System.out.print("");
        }
        else {
            System.out.println("Warning: pressure is out of range");
        }
        System.out.println("Input front left pressure");
        frontLeft = scan.nextInt();
        if (34 < frontLeft && frontLeft < 46) {
            System.out.print("");
        }
        else {
            System.out.println("Warning: pressure is out of range");
        }
        System.out.println("Input back right pressure");
        backRight = scan.nextInt();
        if (34 < backRight && backRight < 46) {
            System.out.print("");
        }
        else {
            System.out.println("Warning: pressure is out of range");
        }
        System.out.println("Input back left pressure");
        backLeft = scan.nextInt();
        if (34 < backLeft && backLeft < 46) {
            System.out.print("");
        }
        else {
            System.out.println("Warning: pressure is out of range");
        }
        
        if (34 < frontRight && frontRight < 46 && 34 < frontLeft && frontLeft < 46 && 34 < backRight && backRight < 46 && 34 < backLeft && backLeft < 46) {
            System.out.println("inflation is OK");
        }
        else {
            System.out.println("inflation is BAD");
        }
    }
}