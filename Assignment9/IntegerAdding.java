import java.util.Scanner;

class IntegerAdding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numOfInts;
        int sum = 0;
        int count = 0;
        //asking for input
        System.out.println("How many numbers will be added up:");
        numOfInts = scan.nextInt();
        //loop that while count is less than numOfInts will add the number they input to the sum
        while (count < numOfInts) {
            System.out.println("Enter a number:");
            sum += scan.nextInt();
            count++;
        }
        //print sum
        System.out.println("the sum is: " + sum);
    }
}