import java.util.Scanner;

public class DrugPotency {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int month = 0;
        double effectiveness;
        //input
        System.out.println("Enter current effectiveness percent:");
        effectiveness = scan.nextDouble();
        //loop while over 50% effectiveness
        while (effectiveness >= 50) {
            //output
            System.out.println("month: " + month + "    effectiveness: " + effectiveness);
            
            month++;
            effectiveness = effectiveness - effectiveness * 0.04;
        }
        //output
        System.out.print("month: " + month + "    effectiveness: " + effectiveness);
        System.out.println(" DISCARDED");
    }
}