import java.util.Scanner;

class ShippingCalc {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int weight;
        //ask for input
        System.out.println("Enter the weight of your order: ");
        weight = scan.nextInt();
        //calculations for different circumstances
        if (weight > 10) {
            System.out.println("Shipping cost: $" + ((weight-10)*0.25+3));
            } 
        else if (weight <= 0) {
            System.out.println("");
        }
        else {
            System.out.println("Shipping cost: $3.00");
            }
        //loop while weight is more than zero  
        while (weight > 0) {
            
            System.out.println("Enter the weight of your order(0 or less to exit): ");
            
            weight = scan.nextInt();
            
        if (weight > 10) {
            System.out.println("Shipping cost: $" + ((weight-10)*0.25+3));
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