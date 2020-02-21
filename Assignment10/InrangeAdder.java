import java.util.Scanner;

class InrangeAdder {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double lowEnd, highEnd, number, inRangeSum, outOfRangeSum;
        
        inRangeSum = 0;
        
        outOfRangeSum =0;
        
        System.out.println("Enter low end: ");

        lowEnd = scan.nextDouble();
        
        System.out.println("Enter high end: ");
        
        highEnd = scan.nextDouble();
        
        System.out.println("Enter a number: ");
        
        number = scan.nextDouble();
        //making sure the first number is counted towards the sums
        if (number >= lowEnd && number <= highEnd) {
                inRangeSum += number;
            }
            else {
                outOfRangeSum += number;
            }
        //keep asking for input until the user types 0 as an input    
        while (number != 0) {
            
            System.out.println("Enter a number (0 to exit): ");

            number = scan.nextDouble();
            
            if (number >= lowEnd && number <= highEnd) {
                inRangeSum += number;
            }
            else {
                outOfRangeSum += number;
            }
        }
        //output the sums
        System.out.println("Sum of in range values: " + inRangeSum);
        System.out.println("Sum of out of range values: " + outOfRangeSum);
    }
}