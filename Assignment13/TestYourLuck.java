import java.util.Scanner;
import java.util.Random;

class TestYourLuck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();
        
        int num, guess, amountCorrect = 0;
        //loop 10 times
        for (int i = 0; i < 10; i++) {
        num = generaterandom.nextInt(100) + 1;
        System.out.println("Enter you guess (1 for 1-50, 2 for 51-100)");
        guess = scan.nextInt();
        //tests whether num is bigger or smaller than fifty and tests whether the user guessed correctly
        if (num <= 50) {
            if (guess == 1) {
                amountCorrect++;
            }
        } else if (num >= 51) {
            if (guess == 2) {
                amountCorrect++;
            }
        }
    }
    //outputs amount of times correct
    System.out.println("You were correct " + amountCorrect + " times");
    //tests if user is lucky
    if (amountCorrect >= 6) {
        System.out.print("Lucky");
    }
    
    }
}