import java.util.Scanner;

class ShippingCalc {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int weight;
        
        System.out.println("Enter the weight of your order: ");
        
        weight = scan.nextInt();
        
        if (weight > 10) {
            System.out.println("%.2f".format("Shipping cost: $" + ((weight-10)*0.25+3)));
            } 
        else if (weight <= 0) {
            System.out.println("");
        }
        else {
            System.out.println("Shipping cost: $3.00");
            }
            
        while (weight > 0) {
            
            System.out.println("Enter the weight of your order(0 or less to exit): ");
            
            weight = scan.nextInt();
            
        if (weight > 10) {
            System.out.println("%1$.2f".format("Shipping cost: $" + ((weight-10)*0.25+3)));
            } 
        else if (weight <= 0) {
            System.out.println("");
        }
        else {
            System.out.println("Shipping cost: $3.00");
            }
        }
        System.out.println("Bye");
    }
}