import java.util.Scanner;

class mpg {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double initialmiles, finalmiles, gallons;
        //ask for input
        System.out.print("Enter initial miles: ");

        initialmiles = scan.nextDouble();
        //keep running the program while initialmiles is NOT negative 1
        while (initialmiles != -1) {
            //ask for input
            System.out.print("Enter Final Miles: ");

            finalmiles = scan.nextDouble();
            //ask for input
            System.out.print("Enter gallons: ");

            gallons = scan.nextDouble();
            //give output
            System.out.println("Miles per Gallon: "+( finalmiles-initialmiles )/gallons);

            System.out.println();

            System.out.print("Enter initial miles (-1 to exit): ");

            initialmiles = scan.nextDouble();
        }

        System.out.println("Bye");
    }
}