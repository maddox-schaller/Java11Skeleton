import java.util.Scanner;

class ParcelShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double height, width, depth, weight, volume, overweight = 0, oversized = 0, total = 5;
        //input
        System.out.println("Enter the height (m):");
        height = scan.nextDouble();
        System.out.println("Enter the width (m):");
        width = scan.nextDouble();
        System.out.println("Enter the depth (m):");
        depth = scan.nextDouble();
        System.out.println("Enter the weight (kg):");
        weight = scan.nextDouble();
        //find volume
        volume = height * width * depth;
        //test if oversized
        if (volume > 5) {
            oversized += 20;
            total += 20;
            System.out.println("oversized cost: " + oversized);
        } else {
            System.out.println("oversized cost: " + oversized);
        }
        //test if overweight
        if (weight > 5) {
            overweight += 10;
            total += 10;
            System.out.println("overweight cost: " + overweight);
        } else {
            System.out.println("overweight cost: " + overweight);
        }
        //output
        System.out.println("total cost: " + total);
    }
}