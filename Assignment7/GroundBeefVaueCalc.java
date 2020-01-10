import java.util.Scanner;

public class GroundBeefVaueCalc {
    public static void main(String[] args) {
        Scanner yeet = new Scanner (System.in);
        
        
        double costA, costB, g, f, percentA, percentB;
        
        System.out.println("Price per pound package A: ");
        costA = yeet.nextDouble();
        System.out.println("Percent lean package A: ");
        percentA = yeet.nextInt();
        System.out.println("Price per pound package B: ");
        costB = yeet.nextDouble();
        System.out.println("Percent lean package B: ");
        percentB = yeet.nextInt();
        yeet.close();
        g = (double) 100/percentA*costA;
        
        f = (double) 100/percentB*costB;
        
        System.out.println("Package A cost per pound of lean:" + g);
        System.out.println("Package B cost per pound of lean:" + f);
        
        if (g > f) {
            System.out.println("Package B is the best value");
        }
        else if (f > g) {
            System.out.println("Package A is the best value");
        }
        else {
            System.out.println("They are the same value");
        }
    }
}