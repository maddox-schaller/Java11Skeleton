import java.util.Scanner;

public class AnnualApplianceCost{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double kilowattHourCost, annualCost;
        int kilowattHourTime;
        
        System.out.println("Enter cost per kilowatt-hour in cents");
        kilowattHourCost = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        kilowattHourTime = scan.nextInt();
        
        annualCost = kilowattHourCost * kilowattHourTime / 100;
        
        System.out.print("Annual cost: $");
        System.out.println(String.format("%.02f", annualCost));
    }   
}