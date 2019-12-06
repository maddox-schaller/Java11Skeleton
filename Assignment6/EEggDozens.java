import java.util.Scanner;
class EEggDozens {
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        long eggs, dozens, leftoverEggs;
        
        
        System.out.println("Enter the number of eggs you have:");
        eggs = scan.nextInt();
        
        dozens = eggs / 12;
        leftoverEggs = eggs % 12;
        
        if (dozens == 1 && leftoverEggs == 0) {
            System.out.println("You have a dozen eggs");
        
        }
        else if (dozens == 1)
            System.out.println("You have a dozen and " + leftoverEggs + " eggs.");
        
        else if (leftoverEggs == 0) {
            System.out.println("You have " + dozens + " dozen eggs.");
        }
        else {
        System.out.println("You have " + dozens + " dozen and " + leftoverEggs + " eggs.");
        }
    }     
}  