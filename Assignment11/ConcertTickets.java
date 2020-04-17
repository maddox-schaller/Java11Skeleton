import java.util.Scanner;

class ConcertTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double price, subtotal, tax, total;
        int amount;
        //input
        System.out.println("Enter the price of one ticket:");
        price = scan.nextDouble();
        System.out.println("Enter how many tickets you're getting:");
        amount = scan.nextInt();
        
        subtotal = price * amount;
        
        tax = subtotal * 0.13;
        
        total = subtotal + tax;
        //output
        System.out.println("Subtotal: " + subtotal + "    tax: " + tax + "    total: " + total);
    }
}
        