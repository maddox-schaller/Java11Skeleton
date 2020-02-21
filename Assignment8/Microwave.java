import java.util.Scanner;

public class Microwave {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int numberOfItems, singleHeatingTimeSeconds;
        
        System.out.println("How many items are you heating up?");
        numberOfItems = scan.nextInt();
        if (numberOfItems > 3) {
            System.out.println("Do not heat up four or more items at the same time.");
        } else {
            System.out.println("How many seconds does the instructions suggest to heat up one of these items?");
            singleHeatingTimeSeconds = scan.nextInt();
            
            if (numberOfItems == 1) {
                System.out.println("Heat your item up for " + singleHeatingTimeSeconds + " seconds.");
            }
            if (numberOfItems == 2) {
                System.out.println("Heat your item up for " + singleHeatingTimeSeconds * 1.5 + " seconds.");
            }
            if (numberOfItems == 3) {
                System.out.println("Heat your item up for " + singleHeatingTimeSeconds * 2 + " seconds.");
            }
        }
    }
}