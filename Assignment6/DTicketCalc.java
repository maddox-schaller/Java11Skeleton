import java.util.Scanner;
class DTicketCalc {
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        long tickets;
        double ticketCost, totalCost;
        
        System.out.println("Enter the number of tickets you want:");
        tickets = scan.nextInt();
        System.out.println("Enter the price of these tickets:");
        ticketCost = scan.nextDouble();
        
       
        totalCost = tickets * ticketCost;
        
        
        System.out.println("The total cost of your tickets will be $" + totalCost + ".");
     }     
    }  