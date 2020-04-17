import java.util.Scanner;
import java.util.Random;

class Guessgame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();
        
        int keepGoing = 0;
        //loop for if the user want to keep playing
        do {
            int num, guess, guessTries = 0;
            num = generaterandom.nextInt(100) + 1;
            //loops is user is incorrect
            do {
                System.out.print("Guess the number: ");
                guess = scan.nextInt();
                if (guess > num) {
                    System.out.println("Too High");
                    
                }
    
                if (guess < num) {
                    System.out.println("Too Low");
                }
                guessTries++;
            } while (num != guess); 
            //output
            System.out.println("You got it, it took you " + guessTries + "tries");
            //asks user if they want to play again
            System.out.println("do you want to play again? (1 for yes, 0 for no)");
            keepGoing = scan.nextInt();
        } while (keepGoing == 1);
    }
}