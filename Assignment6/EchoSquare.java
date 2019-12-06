import java.util.Scanner;
class EchoSquare {
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        long num, square;
        
        System.out.println("Enter an integer:");
        num = scan.nextInt();
        
        square = num * num;
        
        System.out.println("The square of " + num + " is " + square);
     }     
    }  