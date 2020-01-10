import java.util.Scanner;

public class PieEatingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int weight;
        
        System.out.print("Enter your weight: ");
        weight = scan.nextInt();
        
        if (weight > 219 && weight < 281) {
            System.out.println("You are allowed in this contest");
        }
        else {
            System.out.println("You aren't allowed in this contest");
        }
        
    }
}