import java.util.Scanner;
class ACalculateRectArea {
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        long width,height, area;
        
        System.out.println("Enter a width:");
        width = scan.nextInt();
        System.out.println("Enter a height");
        height = scan.nextInt();
        
        area = width * height;
        
        System.out.println("The area of a rectangle with a width of " + width + " and a height of " + height + " is " + area);
     }     
    }  