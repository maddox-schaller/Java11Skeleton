import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first, second, third, sum;      // declaration of int variables

        System.out.println("Enter first integer:");
        first = scan.nextInt();       // read chars and convert to int

        System.out.println("Enter second integer:");
        second = scan.nextInt();   // read chars and convert to int

        
        System.out.println("Enter third integer:");
        third = scan.nextInt(); 
        
        
        sum = first + second + third;         // add the two ints, put result in sum

        System.out.println("The sum of " + first + " plus " + second + " plus " + third + " is " + sum);
    }
}