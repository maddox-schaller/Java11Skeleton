import java.util.Scanner;

class Cents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int totalCents, dollars, remainderCents;
        //input
        System.out.println("Enter how many cents you have:");
        totalCents = scan.nextInt();
        //find dollars
        dollars = totalCents / 100;
        //find remainder
        remainderCents = totalCents % 100;
        //output
        System.out.println(totalCents + " cents is " + dollars + " dollars and " + remainderCents + " cents");
    }
}