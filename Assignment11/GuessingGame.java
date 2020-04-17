import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int attempt = 1;
        double randomNum = (Math.random()*10)+1;
        double number;
        boolean goodAnswer = false;
        //stop loop when 3 attempts used or correct answer achieved
        while (attempt < 4 && !goodAnswer) {
            boolean correct = true;
            //ask for number
            System.out.println("Enter a number: ");
            number = scan.nextDouble();
            //test is number is correct
            if (number != randomNum) {
                correct = false;
            } else {
                System.out.println("CORRECT!");
                goodAnswer = true;
                break;
            }
           // add attempt
            attempt++;
        }
        //print out fail message if needed.
        if (attempt >= 4) {
            System.out.println("Failed");
        }
    }
}