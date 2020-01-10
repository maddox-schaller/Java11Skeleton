import java.util.Scanner;

public class DisountPrices {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double purchaseCost, discountAmount, costWithDiscount;
        
        System.out.println("Enter amount of purchases:");
        purchaseCost = scan.nextDouble();
        discountAmount = purchaseCost * 0.1;
        costWithDiscount = purchaseCost - discountAmount;
        
        System.out.print("Discounted price: $");
        System.out.println(String.format("%.02f", costWithDiscount));
    
    }
}