import java.util.Scanner;

public class NumberSquarer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number, guess;
        
        System.out.println("Enter a number");
        number = scan.nextInt();
        while (number != 0) {
        System.out.println(number + " ^ 2 = " + number * number);
        
        System.out.println("Enter a number");
        number = scan.nextInt();
    }
    System.out.println("bye");
    }
}