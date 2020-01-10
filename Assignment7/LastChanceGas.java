import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int tankCapacity, gasPercent, milesPerGallon, totalDistance;
        
        System.out.println("Tank capacity: ");
        tankCapacity = scan.nextInt();
        System.out.println("Gage reading: ");
        gasPercent = scan.nextInt();
        System.out.println("Miles per gallon: ");
        milesPerGallon = scan.nextInt();
        
        totalDistance = (gasPercent/100)*tankCapacity*milesPerGallon;
        
        if (totalDistance < 200) {
            System.out.println("Get Gas!");
        }
        else {
            System.out.println("Safe to Proceed");
        }
    }
}