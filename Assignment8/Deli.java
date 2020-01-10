import java.util.Scanner;

public class Deli {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String item, delivery;
        double itemPrice, totalPrice, deliveryPrice;
        
        System.out.print("Enter the item: ");
        item = scan.nextLine();
        System.out.print("Enter the price: ");
        itemPrice = scan.nextDouble();
        scan.nextLine();
        
        while (true) {
        System.out.print("Overnight delivery? ");
        delivery = scan.nextLine();
        if (delivery.equals("yes") || delivery.equals("Yes")) {
            deliveryPrice = 5.00;
            break;
        }
        else if (delivery.equals("no") || delivery.equals("No")) {
            deliveryPrice = 2.00;
            break;
        }
        else {
            System.out.println("Enter yes or no as an answer");
        }
    }
        totalPrice = deliveryPrice + itemPrice;
        System.out.println();
        System.out.println("Invoice:");
        System.out.println(item + "\t" + itemPrice);
        System.out.println(delivery + "\t\t" + deliveryPrice);
        System.out.println("total \t\t" + totalPrice);
    
    }
}