import java.util.Scanner;
import java.util.Random;

class RandomGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();
        
        int num, guess;
        
        num = generaterandom.nextInt(100) + 1;
        //input
        System.out.println("Guess a number between 1 and 100: ");
        guess = scan.nextInt();
        //output
        if (num == guess) {
            System.out.println("CORRECT!");
        } else {
            System.out.println("you were " + (num - guess) + " off");
        }
    }
}