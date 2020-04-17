import java.util.Scanner;
import java.io.*;

class PrintNumbersToFile {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        int iq = 0;
        int gender = 0;
        int height = 0;
        //add file
        File file = new File("data.txt");
        //add printstream
        PrintStream print = new PrintStream(file);
        //loop while age isn't -1
        while (age != -1) {
            System.out.print("AGE(-1 to exit): ");
            age = scan.nextInt();
            print.println(age);
            //break loop as soon as age is -1
            if (age == -1) {
                break;
            }
            System.out.print("IQ: ");
            iq = scan.nextInt();
            print.println(iq);
            System.out.print("Gender (1 for male, 0 for female): ");
            gender = scan.nextInt();
            print.println(gender);
            System.out.print("Height (inches): ");
            height = scan.nextInt();
            print.println(height);
        }
        //close printstream
        print.close();
    }
}