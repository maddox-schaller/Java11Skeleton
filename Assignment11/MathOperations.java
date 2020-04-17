import java.util.Scanner;

class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double number1, number2;
        //input
        System.out.println("Enter the first number:");
        number1 = scan.nextDouble();
        System.out.println("Enter the second number:");
        number2 = scan.nextDouble();
        //output
        System.out.println("Added: " + (number1+number2) + "    Subtracted: " + (number1-number2) + "   Multiplied: " + (number1*number2) + "   Divided: " + (number1/number2));
    }
}
        