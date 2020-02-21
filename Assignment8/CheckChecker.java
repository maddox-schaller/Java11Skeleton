import java.util.Scanner;

public class CheckChecker {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int savingsAcc, checkingAcc;
        
        System.out.println("Enter the amount of money in your savings account:");
        savingsAcc = scan.nextInt();
        System.out.println("Enter the amount of money in your checking account:");
        checkingAcc = scan.nextInt();
        
        if (checkingAcc > 1000 || savingsAcc > 1500) {
            System.out.println("Checks cost nothing for you");
        }
        else {
            System.out.println("checks cost 0.15 for you");
        }
        
    }
}