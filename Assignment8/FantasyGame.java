import java.util.Scanner;

public class FantasyGame {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String name;
        int strength, health, luck;
        
        System.out.println("Enter your character's name:");
        name = scan.nextLine();
        System.out.println("Enter strength (1-10):");
        strength = scan.nextInt();
        System.out.println("Enter health (1-10):");
        health = scan.nextInt();
        System.out.println("Enter luck (1-10):");
        luck = scan.nextInt();
        
        if (strength+health+luck > 15){
            System.out.println("You have give your character too many points!  Default values have been assigned:");
            System.out.println(name + ", strength: " + 5 + ", health: " + 5 + ", luck : " + 5);
        }
        else {
            System.out.println("Your character's stats have been assigned:");
            System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck : " + luck);
        }
    }
}