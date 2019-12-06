import java.util.Scanner;
class BRectPaintCost {
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        long width, height;
        double paintCost, totalCost;
        
        System.out.println("Enter a width:");
        width = scan.nextInt();
        System.out.println("Enter a height:");
        height = scan.nextInt();
        System.out.println("Enter a paint cost per sqaure area:");
        paintCost = scan.nextDouble();
        
        totalCost = width * height * paintCost;
        
        System.out.println("The cost to get an area of a rectangle with a width of " + width + " and a height of " + height + " painted with a paint cost per square area of " + paintCost + " is $" + totalCost);
     }     
    }  