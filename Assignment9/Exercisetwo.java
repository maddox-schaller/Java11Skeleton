import java.util.Scanner;

class Exercisetwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count;

        String inputString;

        int times;
        // ask for input
        System.out.println("Enter word:");
        
        inputString = scan.nextLine();
        // define "times" as the number of letters in "inputString"
        times = inputString.length();
        // value of count starts at 1
        count = 1;
        // loop where while "count" is less than or equal to "times" it outputs inputString and adds 1 to count
        while (count<=times) {
            System.out.println(inputString);
            count = count + 1;
        }
    }
}