import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int timesTable, guess, amountCorrect = 0, keepPracticing = 1;
        
        
        while (keepPracticing > 0) {
        System.out.println("What times table would you like to practice?");
        timesTable = scan.nextInt();
        
        for (int i = 1; i < 11; i++){
        System.out.print(timesTable + " x " + i + " = ");
        guess = scan.nextInt();
        if (guess == timesTable * i) {
            System.out.println("CORRECT!");
            amountCorrect++;
        } else {
            System.out.println("INCORRECT! the correct answer was " + timesTable * i);
        }
        
      }
        System.out.println("you got " + amountCorrect + " out of 10 correct");
        System.out.println("would you like to keep practicing? (0 or less to exit)");
        keepPracticing = scan.nextInt();
        amountCorrect = 0;
    }
    }
}
