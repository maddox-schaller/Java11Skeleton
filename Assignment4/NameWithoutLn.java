import java.util.Scanner;

public class NameWithoutLn
{
   public static void main (String[] args)
   {
       String inData;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter your name:" + "\n");
       inData = scan.nextLine();
       
       System.out.print("\n" + "Hello, " + inData + ".");
    }    
}