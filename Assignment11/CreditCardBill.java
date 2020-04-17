import java.util.Scanner;

public class CreditCardBill {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double balance = 1000;
        double payment, totalPayment;
        int month = 1;
        //input
        System.out.println("Enter the monthly payment:");
        payment = scan.nextDouble();
        
        totalPayment = payment;
        //loop while balance is positive
        while (balance > 0) {
            //find new balance
            balance = balance * 1.015 - payment;
            //output
            System.out.println("Month: " + month + "    balance: " + balance + "    total payments: " + totalPayment);
            
            month++;
            totalPayment += payment;
        }
    }
}
