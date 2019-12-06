import java.util.Scanner;

public class Name
{
   public static void main (String[] args)
   {
       String inData;
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter your name:" + "\n");
       inData = scan.nextLine();
       
       System.out.println("\n" + "Hello, " + inData + ".");
    }    
}