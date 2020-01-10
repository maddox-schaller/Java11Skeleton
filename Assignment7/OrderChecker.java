import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int bolts, nuts, washers, totalCost;
        
        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;
        
        System.out.print("Number of bolts: ");
        bolts = scan.nextInt();
        System.out.print("Number of nuts: ");
        nuts = scan.nextInt();
        System.out.print("Number of washers: ");
        washers = scan.nextInt();
        
        totalCost = boltPrice*bolts+nutPrice*nuts+washerPrice*washers;
        
        if (nuts < bolts) {
            System.out.println("Check the Order: too few nuts");
        }
        else {
            System.out.print("");
        }  
        if (washers < 2*bolts) {
            System.out.println("Check the Order: too few washers");
        }
        else {
            System.out.print("");
        }  
        if (nuts >= bolts && washers >= 2*bolts) {
            System.out.println("Order is OK");
        }
        
        System.out.println("Total cost: " + totalCost);
    }
}