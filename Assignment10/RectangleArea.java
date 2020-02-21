import java.util.Scanner;

class RectangleArea {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x1, y1, x2, y2, width, height, area;
        
        System.out.println("Computer Aided Design Program");
        //ask for input
        System.out.println("First corner X coordinate:");
        x1 = scan.nextInt();
        System.out.println("First corner Y coordinate:");
        y1 = scan.nextInt();
        System.out.println("Second corner X coordinate:");
        x2 = scan.nextInt();
        System.out.println("Second corner Y coordinate:");
        y2 = scan.nextInt();
        //making sure that output isn't negative
        if (x2 > x1) {
            width = x2 - x1;
        } else {
            width = x1 - x2;
        }
        if (y2 > y1) {
            height = y2 - y1;
        } else {
            height = y1 - y2;
        }
        area = width * height;
        //output
        System.out.println("Width: " + width + " Height: " + height + " Area: " + area);
        //loop while output isn't zero
        while (!(width == 0 || height == 0)) {
            System.out.println("First corner X coordinate:");
            x1 = scan.nextInt();
            System.out.println("First corner Y coordinate:");
            y1 = scan.nextInt();
            System.out.println("Second corner X coordinate:");
            x2 = scan.nextInt();
            System.out.println("Second corner Y coordinate:");
            y2 = scan.nextInt();
        //making sure that output isn't negative    
        if (x2 > x1) {
            width = x2 - x1;
        } else {
            width = x1 - x2;
        }
        if (y2 > y1) {
            height = y2 - y1;
        } else {
            height = y1 - y2;
        }
        
            area = width * height;
            //output
            System.out.println("Width: " + width + " Height: " + height + " Area: " + area);
            System.out.println("");
        }
        System.out.println("Finished");
    }
}