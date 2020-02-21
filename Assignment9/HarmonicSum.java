import java.util.Scanner;

class HarmonicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N;
        double count = 0;
        double sum = 0;
        //ask for input
        System.out.println("Enter N:");
        N = scan.nextInt();
        //loop so while count is less than N you divide 1 by count plus 1 and add it so the sum, then add 1 to count
        while (count < N) {
            sum += 1/(count+1);
            count++;
        }
        // print the sum
        System.out.println("Sum is: " + sum);
    }
}