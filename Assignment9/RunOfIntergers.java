import java.util.Scanner;

class RunOfIntergers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start, end;

        // ask user for start and end for the sequence
        System.out.println("Enter Start:");
        start = scan.nextInt();
        System.out.println("Enter End:");
        end = scan.nextInt();

        // loop so while "start" is less than or equal to "end" loop prints start and adds 1 to start
        while (start <= end) {
            System.out.println(start);
            start++;
        }
    }
}